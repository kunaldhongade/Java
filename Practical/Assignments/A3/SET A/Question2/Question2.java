import java.io.*;
import java.util.Scanner;

abstract class Shape {
	public final float pi = 3.14f;

	abstract void cal_area();

	abstract void cal_volume();
}

class sphere extends Shape {
	float r;

	sphere() {
		System.out.print("\nEnter Radius of Sphere : ");
		Scanner sc = new Scanner(System.in);
		r = sc.nextFloat();
	}

	void cal_area() {
		System.out.println("\n Area of Sphere is : " + 4.0f * pi * r * r);
	}

	void cal_volume() {
		System.out.println("\n Volume of Sphere is : " + (4.0f / 3.0f) * pi * r * r * r);
	}
}

class cone extends Shape {
	float r;
	float h;

	cone() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Radius of Cone : ");
		r = sc.nextFloat();
		System.out.print("Enter Height of Cone : ");
		h = sc.nextFloat();
	}

	void cal_area() {
		System.out.println("\n Area of Cone is : " + pi * r * (r + java.lang.Math.sqrt((h * h) + (r * r))));
	}

	void cal_volume() {
		System.out.println("\n Volume of Cone is : " + (pi * r * r * h) / 3.0f);
	}
}

class cylinder extends Shape {
	float r;
	float h;

	cylinder() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Radius of Cylinder : ");
		r = sc.nextFloat();
		System.out.print("Enter Height of Cylinder : ");
		h = sc.nextFloat();
	}

	void cal_area() {
		System.out.println("\n Area of Cylinder is : " + 2.0f * pi * r * h + 2.0f * r * r);
	}

	void cal_volume() {
		System.out.println("\n Volume of Cylinder is : " + pi * r * r * h);
	}
}

class box extends Shape {
	float l;
	float w;
	float h;

	box() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter length of Box : ");
		l = sc.nextFloat();
		System.out.print("Enter width of Box : ");
		w = sc.nextFloat();
		System.out.print("Enter Height of Box : ");
		h = sc.nextFloat();
	}

	void cal_area() {
		float x = (2.0f * l * w) + (2.0f * l * h) + (2.0f * w * h);
		System.out.println("\n Area of Box is : " + x);
	}

	void cal_volume() {
		System.out.println("\n Volume of Box is : " + l * w * h);
	}
}

public class Question2 {
	public static void main(String[] a) {
		/*
		 * sphere s=new sphere();
		 * s.cal_area();
		 * s.cal_volume();
		 * cone c=new cone();
		 * c.cal_area();
		 * c.cal_volume();
		 * cylinder cy=new cylinder();
		 * cy.cal_area();
		 * cy.cal_volume();
		 */
		box b = new box();
		b.cal_area();
		b.cal_volume();

	}
}
