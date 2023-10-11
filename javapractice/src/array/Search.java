package array;

import java.util.Scanner;

public class Search {
	
	public static void main(String[] args)
	{
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the values");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter the search value");
		int key=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{	
			count=1;
			}
		}
		if(count==0)
			System.out.println(key+" is not present in the array");
		else
			System.out.println(key+" is present in the array");
		
	}
	

}
