/*
    Write a menu driven program to perform the following operations on 2D array:
        1. Sum of diagonal elements
        2. Sum of upper disgonal elements
        3. Sum of lower diagonal elements
        4. Exit
 */

import java.io.*;
import java.util.Scanner;
class que7{
    public static void main(String[] args)
    {
        int[][] a = new int[3][3];
        Scanner s = new Scanner(System.in);
        int dsum =  0;
        int udsum =  0;
        int ldsum =  0;


        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println();
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println();
        }
        System.out.println("The sum of diagonal elements is : ");
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
               if(i == j)
               {
                dsum+=a[i][j];
               }
            }
        }
        System.out.println(dsum);
        System.out.println("The sum of Upper diagonal elements is : ");
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
               if(i < j)
               {
                udsum+=a[i][j];
               }
            }
        }
        System.out.println(udsum);
        System.out.println("The sum of Lower diagonal elements is : ");
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
               if(i > j)
               {
                ldsum+=a[i][j];
               }
            }
        }
        System.out.println(ldsum);
    }
}