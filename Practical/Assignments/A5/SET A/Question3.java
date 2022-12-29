import java.io.*;
import java.util.*;

public class Question3
{
	public static void main(String[] arg)
	{
		String userName,passWord;
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.print("Enter Username : ");
		userName=sc.nextLine();
		
		System.out.print("Enter Password : ");
		passWord=sc.nextLine();
		
		if(userName!=passWord)
		{
			throw new IncorrectPasswordException();
		}
		}
		catch(IncorrectPasswordException e)
		{
			System.out.print("Incorrect Password.");	
		}
	}
}