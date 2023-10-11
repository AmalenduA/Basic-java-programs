package controlstmt;

import java.util.Scanner;

public class Words {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		if(n<0||n>999)
			System.out.println("invalid");
		else
		{
			int a=n%10;
			int b=n/10;
			int c=b%10;
			int d=n/100;
			String st[]= {" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
			String td[]= {" ","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety",};
			String h="hundred";
		if(n<20)
			System.out.println(st[n]);
		else if(n>20&&n<100)
			System.out.println(td[b]+" "+st[a]);
		else if(n==100)
			System.out.println(h);
		else 
			System.out.println(st[d]+" "+h+" "+td[c]+" "+st[a]);
		}
	}

}
