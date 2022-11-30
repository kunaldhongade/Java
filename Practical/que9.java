/*
    Create an employee class(id, name, deptname, salary). Define a default and parameterized constructor. 
    Use ‘this’ keyword to initialize instance variables. Keep a count of objects created. 
    Create objects using parameterized.
 */

import java.io.*;
import java.util.Scanner;
class Employee{
    private int id;
    private String name;
    private String deptname;
    private float salary;
    static int count = 0;
    Employee(){
        this.id = 0;
        this.name = "";
        this.deptname = "";
        this.salary = 0f;
    }
    Employee(int i,String n,String d,float s)
    {
        this.id = i;
        this.name = n;
        this.deptname = d;
        this.salary = s;
        count++;
    }
    public void Display(){
        System.out.printf("%20d %20s %20s %20f\n",this.id,this.name,this.deptname,this.salary);
    }
}
class que9{
    public static void main(String[] args)
    {
        System.out.printf("%20s %20s %20s %20s\n","id","name","deptName","Salary");
        Employee e1 = new Employee(1,"Ravi","CS",3000f);
        Employee e2 = new Employee(2,"Om","CS",5000f);
        Employee e3 = new Employee(3,"Hardik","CE",50000f);
        System.out.printf("Object %d is created\n",Employee.count);

        e1.Display();
        e2.Display();
        e3.Display();
    }
}