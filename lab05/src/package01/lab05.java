/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package01;

/**
 *
 * @author s441004887
 */
import java.sql.*;
import java.text.*;
import java.util.*;

public class lab05 {

    public static Connection con = null;

    public static void main(String[] args) throws Exception {
        estConnection();
        insert("Abdulrahman Al-Muzaini", "05-10-2022");
        insert("Ahmad Mohamad", "25-9-2022");
        insert("Flan Fulany", "13-2-2022");
        closeConnection();
        estConnection();
        print();
    }

    public static void estConnection() {
        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            /**
             * Connecting to the SalesDB database with the user: s4887 and
             * password: 1234
             */
            String url = "jdbc:mysql://localhost:3306/salesdb";
            String user = "s4887";
            String pass = "1234";
            System.out.println("Connecting to database...");
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected!");

            con = conn;
        } catch (Exception e) {
            System.out.println("Connection Failed!");
            System.err.println(e);
        }
    }

    public static void closeConnection() throws SQLException {
        System.out.println("closing connection...");
        con.close();
        System.out.println("closed");
    }

    public static void insert(String name, String hired_date) throws SQLException, ParseException {
        String insq = "INSERT INTO Employees (Name,Hired_Date) values (?,?)";
        PreparedStatement pst = con.prepareStatement(insq);
        pst.setString(1, name);

        DateFormat df = new SimpleDateFormat("dd-MM-yy");
        java.util.Date dateObj = df.parse(hired_date);
        long timeInMilli = dateObj.getTime();
        java.sql.Date sqlHired_Date = new java.sql.Date(timeInMilli);
        pst.setDate(2, sqlHired_Date);
        pst.executeUpdate();
        pst.close();
    }

    public static void print() throws SQLException {
        String sel = "SELECT * FROM Employees";
        PreparedStatement pst = con.prepareStatement(sel);
        ResultSet rs = pst.executeQuery(sel);

        System.out.println("Printing records:");
        System.out.println("-------------------");
        while (rs.next()) {
            int id = rs.getInt("ID");
            String name = rs.getString("Name");
            java.sql.Date sqlHD = rs.getDate("Hired_Date");
            java.util.Date hd = new java.util.Date(sqlHD.getTime());

            System.out.printf("ID: %d, Name: %s, Hired Date: %s%n", id, name, (dateToString(hd, "dd/MM/yyyy")));
        }
        System.out.println("-------------------");

    }

    public static String dateToString(java.util.Date date, String format) {
        if (date != null) {
            DateFormat formatter = new SimpleDateFormat(format);
            String sdate = formatter.format(date);
            return sdate;
        } else {
            return null;
        }
    }
}
