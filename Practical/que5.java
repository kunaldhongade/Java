/*
    Define a class MyNumber having one private int data member. 
    Write a default constructor to initialize it to 0 and another constructor to initialize it to a value (Use this). 
    Write methods isNegative, isPositive, isZero, isOdd, isEven. Create an object in main. 
    Use command line arguments to pass a value to the object 
    (Hint : convert string argument to integer) and perform the above tests. Provide javadoc
    comments for all constructors and methods and generate the html help file.
 */

import java.io.*;
class MyNumber{
    private int i;
    MyNumber(){
        this.i = 0;
    }
    MyNumber(int i){
        this.i = i;
    }
    public void isNegative(){
        if(this.i<0)
        {
            System.out.println("The number is negative");
        }
    }
    public void isPositive(){
        if(this.i>0)
        {
            System.out.println("The number is positive");
        }
    }
    public void isZero(){
        if(this.i==0)
        {
            System.out.println("The number is zero");
        }
    }
    public void isEven(){
        if(this.i != 0)
        {
            if(this.i%2 == 0)
            {
                System.out.println("The number is even");
            }
        }
       
    }
    public void isOdd(){
        if(this.i !=0)
        {
            if(this.i%2 ==1)
            {
                System.out.println("The number is odd");
    
            }
        }
       
    }
}
class que5{
    public static void main(String[] args)
    {
       
        MyNumber n = new MyNumber(Integer.parseInt(args[0]));   
        n.isEven();
        n.isOdd();
        n.isNegative();
        n.isPositive();
        n.isZero();
    }
}