import java.io.*;
import java.util.*;

public class Question2
{
	public static void main(String[] args)
	{
	int arr[]=new int[5];
	arr[0]=5;
	arr[1]=1;
	arr[2]=4;
	arr[3]=3;
	arr[4]=2;
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int t;
				t=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=t;
			}
		}
	}
	System.out.println();
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}