/*
Nombre: Gustavo Navarrete Cruz
Matricula: 2022431**********
 */
package mx.edu.cesba.model;

public class Employee {

    public int id;
    public String firstname;
    public String lastName;
    public int age;
    public String email;
    public int phoneNumber;
    public double salary;
    public String hiredate;

    public void getDetails() {
        System.out.println("Id:" + id);
        System.out.println("First Name:" + firstname);
        System.out.println("Last Name:" + lastName);
        System.out.println("Age:" + age);
        System.out.println("Email:" + email);
        System.out.println("Phone Number:" + phoneNumber);
        System.out.println("Salary:" + salary);
        System.out.println("Hire Date:" + hiredate);

    }

}
