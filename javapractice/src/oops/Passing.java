package oops;

import java.util.Scanner;

public class Passing {
	public static void main(String[] args) 
	{
		Passing pa=new Passing();
		System.out.println("Enter two numbers:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		pa.findSum(a, b);
	}
	void findSum(int a,int b)
	{
		System.out.println("Sum="+(a+b));
	}
	

}
