package controlstmt;

import java.util.Scanner;

public class Sum {
	int i;
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit :");
		int i=s.nextInt();
		System.out.println("Enter the option");
		System.out.println("1.even");
		System.out.println("2.odd");
		int n=s.nextInt();
		Sum obj=new Sum();
		while(i<100)
		{
		switch(n)
		{
		case 1:
			obj.findEven();
			break;
		case 2:
			obj.findOdd();
			break;
		}
		}
	}
	void findEven()
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
		i++;
	}
	void findOdd()
	{
		if(i%2!=2)
		{
			System.out.println(i);
		}
	}
	
}
