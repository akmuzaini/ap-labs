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

    private final String status;

    public Student(String name, String address, String phone, String email,
            String status) {
        super(name, address, phone, email);
        if (statusValidation(status)) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("status must be one of the following: "
                    + "freshman, sophomore, junior, senior.");
        }
    }

    private boolean statusValidation(String status) {
        String[] valid = new String[]{"freshman", "sophomore", "junior", "senior"};
        for (String e : valid) {
            if (status.equalsIgnoreCase(e)) {
                return true;
            }
        }
        return false;
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
