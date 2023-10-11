package controlstmt;

import java.util.Scanner;

public class Decre {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int i=s.nextInt();
		while(1<=i)
		{
			System.out.println(i);
			i--;
		}
		
	}

}
