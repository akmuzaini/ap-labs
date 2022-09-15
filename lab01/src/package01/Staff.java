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
public class Staff extends Employee {

    private String title;

    public Staff(String name, String address, String phone, String email,
            String office, double salary, Date dateHired,
            String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %s",
                "Class name", "Staff", "Staff's name", getName());
    }
}
