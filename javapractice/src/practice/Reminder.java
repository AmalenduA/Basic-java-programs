package practice;

import java.util.Scanner;

// Compute Quotient and Remainder
public class Reminder {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int m=s.nextInt();
		int reminder=n%m;
		int quot=n/m;
		System.out.println(reminder);
		System.out.println(quot);
	}

}
