package array;

import java.util.Scanner;

public class Intro {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the array size ");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the values");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("Enter the key");
		int key=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
				count++;
		}
		if(count==0)
			System.out.println(key+" is not found");
		else if(count==1)
			System.out.println(key+" is found");
		else
			System.out.println(key+"repeatind " +count+" times");
	}

}
