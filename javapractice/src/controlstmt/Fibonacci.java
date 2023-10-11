package controlstmt;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int l=s.nextInt();
		int i=0;
		int j=1;
		int k=0;
		System.out.println(i);
		System.out.println(j);
		while(i<=l)
		{
			k=i+j;
			System.out.println(i);
			i=j;
			j=k;
			
		}
	}
	

}
