import java.io.*;
import java.util.*;

class person
{
	int pid,age;
	String pname,gender;
	
	person()
	{
		this.pid=0;
		this.pname="X.Y.Z";
		this.age=21;
		this.gender="None.";
	}
	person(int pid,String pname,int age,String gender)
	{
		this.pid=pid;
		this.pname=pname;
		this.age=age;
		this.gender=gender;
	}
	void display()
	{
		System.out.printf("%10s %20S %10S %10S",pid,pname,age,gender);
		System.out.println();
	}
}
public class Question6
{
	public static void main(String[] args)
	{
		person p1=new person();
		person p2=new person(1,"Kolte Shreeganesh ",20,"Male");
		person p3=new person(2,"Shahane Om ",20,"Male");
		person p4=new person(3,"Puri Pratik",19,"Male");
		person p5=new person(4,"Nikale Kausthubh",19,"Fe-Male");
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
	}
}