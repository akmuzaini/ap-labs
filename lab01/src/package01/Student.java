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
public class Student extends Person {

    private String status;
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    public Student(String name, String address, String phone, String email,
            String status) {
        super(name, address, phone, email);
        setStatus(status);
    }

    public void setStatus(String st) {
        switch (st) {
            case FRESHMAN:
                status = FRESHMAN;
                break;
            case SOPHOMORE:
                status = SOPHOMORE;
                break;
            case JUNIOR:
                status = JUNIOR;
                break;
            case SENIOR:
                status = SENIOR;
            default:
                throw new IllegalArgumentException("Must use class constants!");
        }
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %s",
                "Class name", "Student", "Student's name", getName());
    }

}
