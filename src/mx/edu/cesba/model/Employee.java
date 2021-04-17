/*
Nombre: Gustavo Navarrete Cruz
Matricula: 2022431**********
 */
package mx.edu.cesba.model;

public class Employee {

    private int id;
    private String firstname;
    private String lastName;
    private int age;
    private String email;
    private int phoneNumber;
    private double salary;
    private String hiredate;
    
    //METODO PARA ACCEDER A EL CAMPO: PRIVAYTE INT ID
    public void setId(int id){
        this.id=id;
    }
    
    public int getId(){
        return id;
    }
    
    //METODO PARA ACCEDER A EL CAMPO: PRIVAYTE STRING FIRSTNAME
    public void setfirstname(String firstname){
        this.firstname=firstname;
    }
    
    public String getfirstname(){
        return firstname;
    }
        //METODO PARA ACCEDER A EL CAMPO: PRIVAYTE STRING LASTNAME
    public void setlastName(String lastName){
        this.lastName=lastName;
    }
    
    public String getlastName(){
        return lastName;
    }
        
    //METODO PARA ACCEDER A EL CAMPO: PRIVAYTE INT AGE
    public void setage(int age){
        if(age>=18&&age<65){
          this.age=age;   
        }else {
            System.err.println("Edad Invalida");
        }
          
       
    }
    
    public int getage(){
        return age;
    }
            //METODO PARA ACCEDER A EL CAMPO: PRIVAYTE STRING EMAIL
    public void setemail(String email){
        this.email=email;
    }
    
    public String getemail(){
        return email;
    }
        //METODO PARA ACCEDER A EL CAMPO: PRIVAYTE INT PHONENUMBER
    public void setphoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    
    public int getphoneNumber(){
        return phoneNumber;
    }
            //METODO PARA ACCEDER A EL CAMPO: PRIVAYTE DOUBLE SALARY
    public void setsalary(double salary){
        this.salary=salary;
    }
    
    public double getsalary(){
        return salary;
    }
                //METODO PARA ACCEDER A EL CAMPO: PRIVAYTE STRING HIREDATE
    public void sethiredate(String hiredate){
        this.hiredate=hiredate;
    }
    
    public String gethiredate(){
        return hiredate;
    }
    
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
