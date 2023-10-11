package array;

import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=s.nextInt();
		System.out.println("Enter the array elements");
		int a[]=new int[n];
		int temp;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
