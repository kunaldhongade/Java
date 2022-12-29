import java.io.*;
import java.util.Scanner;

class Emp
{
	int sal;
	String name;
	static int  max=0;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name :");
		name=sc.next()+sc.nextLine();
		System.out.println("Enter salary");
		sal=sc.nextInt();
		
		if(max<sal)
		{
			max=sal;
		}
	}
	void dis()
	{
		if(max<sal)
		{
			max=sal;
		}
		System.out.println("Name : "+name+" Salary : "+sal);
	}
	
	void check()
	{
		if(max==sal)
		{
			dis();
		}
		else
		{
	    }
	}
}
public class Demo
{
	public static void main(String[] a)
	{
		Emp e[]=new Emp[5];
		
		for(int i=0;i<e.length;i++)
		{
			//e[i]=new Emp();
			//e[i].accept();
		}
		e[0].sal=10000;
		e[1].sal=5000;
		e[2].sal=20000;
		e[3].sal=15000;
		e[4].sal=20000;
		e[0].name="xyz";
		e[1].name="abc";
		e[2].name="lmn";
		e[3].name="pqr";
		e[4].name="cet";
		
		for(int i=0;i<e.length;i++)
		{
		e[i].dis();
		}
		System.out.println("Employee of maximum salary is : ");
		for(int i=0;i<e.length;i++)
		{
			if(e[i].max==e[i].sal)
			{
				e[i].dis();
			}
		}
		
	}
}
