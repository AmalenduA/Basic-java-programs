package controlstmt;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int rev=0;
		int r;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);
	}

}
