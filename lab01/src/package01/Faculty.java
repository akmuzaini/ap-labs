/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package01;

/**
 *
 * @author dell
 */
import java.util.Date;
public class Faculty extends Employee {

    private int[] hours = new int[10];
    private String rank;

    public Faculty(String name, String address, String phone, String email,
            String office, double salary, Date dateHired,
            int[] hours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        setHours(hours);
        setRank(rank);
    }

    public void setHours(int[] hrs) {
//        this.hours = hrs;
        for (int i = 0; i < hrs.length; i++) {
            if ((hrs[i] >= 0) && hrs[i] <= 23) {
                this.hours[i] = hrs[i];
            }
        }
    }

    public int[] getHours() {
        return hours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %s",
                "Class name", "Faculty", "Faculty's name", getName());
    }
}
