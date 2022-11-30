/*
	Write a program to calculate perimeter and area of rectangle implement the program using class and object.
	(hint :area = length * breadth , perimeter=2*(length+breadth))
 */

import java.io.*;

class Calculate{
	private float area;
	private float length;
	private float perimeter;
	private float breadth;

	Calculate(){
		this.area = 0f;
		this.length = 0f;
		this.perimeter =0f;
		this.breadth = 0f;
	}
	
	Calculate(float l, float b){
		this.area = 0f;
		this.length = l;
		this.perimeter =0f;
		this.breadth = b;	
	}
	
	public void area() {
		this.area = this.length * this.breadth;
		System.out.println("The area of react angle is  : "+this.area);
	}
	
	public void perimeter() {
		this.perimeter = 2*(this.length + this.breadth);
		System.out.println("The perimeter of reactangle is : "+ this.perimeter);
	}

}

class que1{

	public static void main(String[] args){
		Calculate c = new Calculate(4f, 5f);
		c.area();
		c.perimeter();
	}
}