package array;

import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int count=0;
		int flag=0;
		System.out.println("Enter values");
		
		for(int i=0;i<n;i++)
			a[i]=s.nextInt(); //to insert values into array
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<n;j++)  //to insert index value of a[] into b[]
			{
				b[j]=i;
			}
		}
		
		System.out.println("key");
		int key=s.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(flag==a[i])
				flag++;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(key==a[i])
				count=b[i];
			}
		}
		if(flag==0)
			System.out.println(key+" not found");
		else if(flag==1)
			System.out.println(key+" found at index "+count);
		else
			System.out.println(key+" repeatind "+count+" times at index "+(+count));
	}
}

