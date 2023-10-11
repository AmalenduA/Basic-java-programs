package forloop;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int rev=0;
		int r;
		for(int n=s.nextInt();n>0;n=n/10)
		{
			r=n%10;
			rev=rev*10+r;
			
		}
		System.out.println(rev);
		
	}

}
