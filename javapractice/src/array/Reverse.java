package array;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String st=s.next();
		char a[]=st.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		
	}

}
