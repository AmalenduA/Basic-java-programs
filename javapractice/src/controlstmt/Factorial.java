package controlstmt;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int fact=1;
		while(n>0)
		{
			fact=n*fact;
			n--;	
		}
		System.out.println(fact);
	}

}
