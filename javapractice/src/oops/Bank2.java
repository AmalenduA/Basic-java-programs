package oops;

import java.util.Scanner;

public class Bank2 extends Bank1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Bank2 bk=new Bank2();
		System.out.println("BANKING SYSTEM");
		System.out.println("Add profile");
		System.out.print("Enter the name:");
	    bk.setName(s.next());
	    System.out.print("Gender:");
	    bk.setGender(s.next());
	    System.out.print("Address:");
	    bk.setAdd(s.next());
	    System.out.print("mobile number:");
	    bk.setPh(s.nextLong());
	    System.out.print("Account number:");
	    bk.setAcc(s.nextLong());
	    System.out.print("Password:");
	    bk.setPass(s.nextLong());
	  int bal=bk.getBal();
	   while(bk.getAcc()>0)
	   {

			System.out.println();
			System.out.println("MENU");
			System.out.println("1.View profile");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Balance");
			System.out.println("5.Exit");
			System.out.print("Enter the option:");
			int n=s.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("*Name:"+bk.getName());
			System.out.println("*Gender:"+bk.getGender());
			System.out.println("*Address:"+bk.getAdd());
			System.out.println("*Mobile number:"+bk.getPh());
			System.out.println("*Account number:"+bk.getAcc());
			System.out.println("*Password:"+bk.getPass());
			break;
		case 2:
			System.out.print("Enter the deposit amount:");
			bk.setDe(s.nextInt());
			bal=bal+bk.getDe();
			System.out.print("Current balance:"+bal);
			System.out.println();
			break;
		case 3:
			System.out.print("Enter the withdraw amount:");
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
