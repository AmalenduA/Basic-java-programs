package oops;

import java.util.Scanner;

public class Poly {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Area");
		System.out.println("1.Square");
		System.out.println("2.Circle");
		System.out.println("3.Cube");
		System.out.print("Enter the option:");
		int n=s.nextInt();
		Poly p=new Poly();
		switch(n)
		{
		case 1:
			System.out.print("Enter the length of square: ");
			int a=s.nextInt();
			p.area(a);
			break;
		case 2:
			System.out.print("Enter the radius of circle: ");
			double r=s.nextDouble();
			p.area(r);
			break;
		case 3:
			System.out.print("Enter the side of a cube: ");
			long c=s.nextLong();
			p.area(c);
		}
	}
	
	void area(int a)
	{
		System.out.println("Area of sqare="+(a*a));
	}
	void area(double r)
	{
		System.out.println("Area of circle="+(3.14*r*r));
	}
	void area(long c)
	{
		System.out.println("Area of cube="+(c*c*c));
	}

}
