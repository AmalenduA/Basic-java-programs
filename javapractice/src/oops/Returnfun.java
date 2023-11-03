package oops;

import java.util.Scanner;

public class Returnfun {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Returnfun re=new Returnfun();
		System.out.println("Enter the numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("sum= "+ re.findSum(a, b));
	}
	int findSum(int a,int b)
	{
		return a+b;
	}

}
