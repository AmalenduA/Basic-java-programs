package controlstmt;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int i=1;
		System.out.println("Enter the limit:");
		int l=s.nextInt();
		System.out.println("Enter the number ");
		int n=s.nextInt();
		while(i<=l)
		{
			System.out.println(i+"*"+n+"="+i*n);
			i++;
		}
		
		
	}

}
