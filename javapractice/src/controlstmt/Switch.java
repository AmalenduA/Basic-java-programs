package controlstmt;

import java.util.Scanner;

public class Switch {
	 public static void main(String[] args) 
	 {
		Scanner s=new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Substaction");
		System.out.println("3.Multiplication");
		System.out.println("4.Divison");
		System.out.println("Enter the option");
		int i=s.nextInt();
		
		switch(i)
		{
		case 1:
			System.out.println("Enter 2 numbers");
			int a=s.nextInt();
			int b=s.nextInt();
			int c=a+b;
			System.out.println("Output= "+c);
			break;
		case 2:
			System.out.println("Enter 2 numbers");
			int d=s.nextInt();
			int e=s.nextInt();
			int f=d-e;
			System.out.println("Output= "+f);
			break;
		case 3:
			System.out.println("Enter 2 numbers");
			int g=s.nextInt();
			int h=s.nextInt();
			int j=g*h;
			System.out.println("Output= "+j);
			break;
		case 4:
			System.out.println("Enter 2 numbers");
			int k=s.nextInt();
			int l=s.nextInt();
			int m=k/l;
			System.out.println("Output= "+m);
			break;
		}
	 }

}
