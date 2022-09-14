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
public class Driver {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Student("Abdulrahman Al-Muzaini", "Makkah", "966535566974", "s441004887@st.uqu.edu.sa", "junior");
        
        System.out.println(persons[0]);
        System.out.println(((Student)(persons[0])).getStatus());
    }
}
