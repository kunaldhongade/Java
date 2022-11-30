/*
    Write a program to accept the array element and find the entered
    number whether present in array or not and print appropriate message
 */

import java.io.*;
import java.util.Scanner;
class que3{
    public static void main(String[] args)
    {
        int[] a = new int[20];
        int search;
        int f = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("How many integers you want to enter");
        int n = s.nextInt();
        System.out.println("Enter elements of array");
        for(int i = 0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Array Printing : ");
        for(int i = 0;i<n;i++)
        {
           System.out.printf("%d : %d\n",i,a[i]);
        }
        System.out.println("Enter element for search");
        search = s.nextInt();
        for(int i = 0;i<n;i++)
        {
            if(a[i]==search)
            {
                System.out.println("Match Found : ");
                System.out.printf("%d : %d\n",i,a[i]);
                f = 1;
            }
        }
        if(f==0)
        {
            System.out.println("Match Not Found");
        }
    }
}