package oops;

import java.util.Scanner;

public class Operation {
	Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Operation op=new Operation();
		op.findSum();
	}
	void findSum()
	{
		System.out.println("Enter two numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Sum = "+(a+b));
	}

}
