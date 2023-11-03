package oops;

import java.util.Scanner;

public class Result1 extends Operation{

	Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Result1 re=new Result1();
		re.findSum();
		re.findDiff();
	}
	
	void findDiff()
	{
		System.out.println("Enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Difference= "+(a-b));
	}

}
