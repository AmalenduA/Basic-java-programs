package array;

import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int count=0;
		int k=0;
		System.out.println("Enter values");
		
		for(int i=0;i<n;i++)
			a[i]=s.nextInt(); //to insert values into array
		
		System.out.println("Enter the search element:");
		int key=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(key==a[i])
			{
				b[k]=i;
				count++;
				k++;
			}
		}
		if(count==0)
			System.out.println(key+" not found");
		else if(count==1)
			System.out.println(key+" found at index "+b[0]);
		else
			System.out.println(key+" repeating at indexes");
		{
			for(int j=0;j<n;j++)
			{
				if(b[j]!=0)
				{
					System.out.print(b[j]+",");
				}
			}
		}
		
	}
}