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
//import java.util.Date;
public class Employee extends Person {

    private String office;
    private double salary;
    private String dateHired;

    public Employee(String name, String address, String phone, String email,
            String office, double salary, String dateHired) {
        super(name, address, phone, email);
        setOffice(office);
        setSalary(salary);
        setDateHired(dateHired);
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getOffice() {
        return office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %s",
                "Class name", "Employee", "Employee's name", getName());
    }
}
