package array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s.nextInt();
		int a[]=new int[n];
		int sum=0;
		System.out.println("Enter the values into array");
		for(int i=s.nextInt();i<n;i++)
		{
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println(a[3]);
		System.out.println(sum);
	}

}
