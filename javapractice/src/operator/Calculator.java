package operator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) 
	{
		System.out.println("CALCULATOR");
		System.out.println("Enter 2 numbers: ");
		Calculator c=new Calculator();
		c.findSum();
		c.findDiff();
		c.findMul();
		c.findDiv();
	}
	
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int y=s.nextInt();
	
	
	void findSum()
	{
		System.out.println("Sum=");
		System.out.println(x+y);
	}
	void findDiff()
	{
		System.out.println("Difference=");
		System.out.println(x-y);
	}
	void findMul()
	{
		System.out.println("Multiplication=");
		System.out.println(x*y);
	}
    void findDiv()
	{
		System.out.println("Division=");
		System.out.println(x/y);
	}
}
