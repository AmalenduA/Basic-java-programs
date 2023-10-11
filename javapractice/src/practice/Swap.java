package practice;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n=s.nextInt();
		int m=s.nextInt();
		System.out.println(n+","+m);
		int temp;
		temp=n;
		n=m;
		m=temp;
		System.out.println(n+","+m);
	}

}
