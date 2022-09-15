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
public class Driver {
    public static void main(String[] args) {
//        System.out.printf("%s: %s%n","name",.getName());
//        System.out.printf("%s: %s%n","Address",.getAddress());
//        System.out.printf("%s: %s%n","Phone number",.getPhone());
//        System.out.printf("%s: %s%n","E-mail address",.getEmail());
        Student st = new Student("Abdulrahman Al-Muzaini", "Makkah", "966535566974", "s441004887@st.uqu.edu.sa", Student.SOPHOMORE);
        System.out.println(st);
        System.out.printf("%s: %s%n","Student name",st.getName());
        System.out.printf("%s: %s%n","Address",st.getAddress());
        System.out.printf("%s: %s%n","Phone number",st.getPhone());
        System.out.printf("%s: %s%n","E-mail address",st.getEmail());
        System.out.printf("%s: %s%n","Status",st.getStatus());
        
        System.out.println("----------------");
        
        Date d = new Date(122, 0, 25);
        Employee emp = new Employee("Jafar Khan","Jeddah","966531234567","jafkhan@gmail.com","Makkah",7500.0,d);
        System.out.println(emp);
        System.out.printf("%s: %s%n","name",emp.getName());
        System.out.printf("%s: %s%n","Address",emp.getAddress());
        System.out.printf("%s: %s%n","Phone number",emp.getPhone());
        System.out.printf("%s: %s%n","E-mail address",emp.getEmail());        
        System.out.printf("%s: %s%n","Office address",emp.getOffice());        
        System.out.printf("%s: %.2f%n","Salary",emp.getSalary());        
        System.out.printf("%s: %s%n","Date hired",emp.getDateHired());        
        
        System.out.println("----------------");
        
        int[] hrs = new int[]{4,5,2,3,7,4};
        Faculty fc = new Faculty("Noor Hamd","Makkah", "0535552343", "nhamd@gmail.com", "Makkah", 2000.0, d, hrs, "Assistant Manager");
        System.out.println(fc);
        System.out.printf("%s: %s%n","name",fc.getName());
        System.out.printf("%s: %s%n","Address",fc.getAddress());
        System.out.printf("%s: %s%n","Phone number",fc.getPhone());
        System.out.printf("%s: %s%n","E-mail address",fc.getEmail());
        System.out.printf("%s: %s%n","Office address",fc.getOffice());
        System.out.printf("%s: %.2f%n","Salary",fc.getSalary());
        System.out.printf("%s: %s%n","Date hired",fc.getDateHired());
        System.out.printf("%s: ","Hours");
        int[] h = fc.getHours();
        for (int i = 0; i < h.length; i++) {
            System.out.print(h[i]+" ");
        }
        System.out.println("");
        System.out.printf("%s: %s%n","Rank",fc.getRank());
        
        System.out.println("----------------");
        
        Staff stf = new Staff("Naem Flan", "Makkah", "0535566974", "nFlan@email.com", "Jeddah", 15000.0, d, "Regional Manager");
        System.out.println(stf);
        System.out.printf("%s: %s%n","name",stf.getName());
        System.out.printf("%s: %s%n","Address",stf.getAddress());
        System.out.printf("%s: %s%n","Phone number",stf.getPhone());
        System.out.printf("%s: %s%n","E-mail address",stf.getEmail());
        System.out.printf("%s: %s%n","Office address",stf.getOffice());
        System.out.printf("%s: %.2f%n","Salary",stf.getSalary());
        System.out.printf("%s: %s%n","Date hired",stf.getDateHired());
        System.out.printf("%s: %s%n","Title",stf.getTitle());
    }
}
