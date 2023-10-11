package practice;

import java.util.Scanner;

//multiplication of two floating point numbers
public class Multiply {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		double a=s.nextDouble();
		double b=s.nextDouble();
		System.out.println("Result="+(a*b));
	}
}
