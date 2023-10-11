package controlstmt;

import java.util.Scanner;

public class While {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int i=1;
		System.out.println("Enter the limit :");
		int lim=s.nextInt();
		System.out.println("1.Even numbers");
		System.out.println("2.Odd numbers");
		int n=s.nextInt();
	
		while(i<=lim)
		{
			switch(n)
			{
			case 1:
				if(i%2==0)
				{
				System.out.println(i);
				}
				i++;
				break;
			case 2:
				if(i%2!=0)
				System.out.println(i);
				i++;
				break;
			}
		}
		
				
		
	}

}
