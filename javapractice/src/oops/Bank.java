package oops;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int bal=1000;
		System.out.println("BANKING SYSTEM");
		System.out.println("Add profile");
		System.out.print("Enter the name:");
		String s1=s.next();
		System.out.print("Enter the mobile number:");
		long s2=s.nextLong();
		System.out.print("Enter the account number:");
		int acc=s.nextInt();
		System.out.print("Enter the password:");
		int ps=s.nextInt();
		while(acc>0)
		{
			System.out.println();
			System.out.println("MENU");
			System.out.println("1.View profile");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Balance");
			System.out.println("5.Exit");
			System.out.println("Enter the option:");
			int n=s.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("Name-"+s1);
			System.out.println("Phone number-"+s2);
			System.out.println("Account number-"+acc);
			
			break;
		case 2:
			System.out.print("Enter the deposit amount:");
			int dep=s.nextInt();
			bal=bal+dep;
			System.out.println("Current balance:"+bal);
			break;
		case 3:
			System.out.print("Enter the amount to withdraw:");
			int with=s.nextInt();
			if(bal<with+1000)
				System.out.println("Insufficient balance");
			else
				bal=bal-with;
				System.out.println("Current balance:"+bal);
			break;
		case 4:
			System.out.println("Balance="+bal);
			break;
		case 5:
			break;
		
		}
		}
	}

}
