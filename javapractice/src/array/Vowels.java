package array;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) 
	{   
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String st=s.next();
		int count=0;
		char a[]=st.toCharArray();

		for(int i=0;i<a.length;i++)
		{
			switch(a[i])
			{
			case 'a':
				System.out.print("a,");
				count=1;
				break;
			case 'e':
				System.out.print("e,");
				count=1;
				break;
			case 'i':
				System.out.print("i,");
				count=1;
				break;
			case 'o':
				System.out.print("o,");
				count=1;
				break;
			case 'u':
				System.out.print("u,");
				count=1;
				break;
			}
		}
		
		if(count==0)
			System.out.println("No vowels present ");
		else
			System.out.println(" are the vowels");
		
		
	}

}
