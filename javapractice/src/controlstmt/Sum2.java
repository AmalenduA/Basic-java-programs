package controlstmt;

import java.util.Scanner;

public class Sum2 {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int value=s.nextInt();
		int i=0;
		int sum=0;
		while(i<=value)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}
	
	

}
