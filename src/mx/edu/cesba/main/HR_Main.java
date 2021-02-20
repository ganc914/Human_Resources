/*
Nombre: Gustavo Navarrete Cruz
Matricula: 2022431*********************************
 */
package mx.edu.cesba.main;

import javax.swing.JOptionPane;
import mx.edu.cesba.model.Employee;

public class HR_Main {
    public static void main(String[] args) {
        
        Employee e1= new Employee();
        Employee e2= new Employee();
        
        e1.setId(1);
        e1.setfirstname(JOptionPane.showInputDialog("Ingrese su Nombre"));
        e1.setlastName (JOptionPane.showInputDialog("Ingrese el apellido"));
        e1.setage (Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
        e1.setemail (JOptionPane.showInputDialog("Ingrese su email"));
        e1.setphoneNumber (Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero telefonico")));
        e1.setsalary (Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario")));
        e1.sethiredate (JOptionPane.showInputDialog("Ingrese la fecha de contratacion"));
        
//        e2.id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID")); 
//        e2.firstname = JOptionPane.showInputDialog("Ingrese su Nombre");
//        e2.lastName = JOptionPane.showInputDialog("Ingrese el apellido");
//        e2.age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
//        e2.email = JOptionPane.showInputDialog("Ingrese su email");
//        e2.phoneNumber  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero telefonico"));
//        e2.salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));
//        e2.hiredate = JOptionPane.showInputDialog("Ingrese la fecha de contratacion");
        
        e1.getDetails();
        System.out.println("***************************************");
//        e2.getDetails();
        
    }
}