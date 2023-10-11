package array;

import java.util.Scanner;

public class SearchString {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=s.next();
		char a[]=st.toCharArray();
		int b[]=new int[a.length];
		int count=0;
		int k=0;
		
		System.out.println("Enter the alphabet:");
		char c=s.next().charAt(0);
		for(int i=0;i<a.length;i++)
		{
			if(c==a[i])
			{
				b[k]=i+1;
				count++;
				k++;
			}
		}
		if(count==0)
			System.out.println(c+" not found");
		else if(count==1)
			System.out.println(c+" is present at index"+b[0]);
		else 
		{
			System.out.println(c+" repeating "+count+" times at ");
			for(int j=0;j<b.length;j++)
			{
				if(b[j]!=0)
					System.out.print(b[j]+",");
			}
		}
	}
}
