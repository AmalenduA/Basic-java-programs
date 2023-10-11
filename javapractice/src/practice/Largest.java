package practice;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
