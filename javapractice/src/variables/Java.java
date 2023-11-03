package variables;

import java.util.Scanner;

public class Java {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number:");
			int n=s.nextInt();
			int sum=0;
			int temp=n;
			int b=n;
			int c=0;
			int a;
			while(temp>0)
			{
				temp=temp/10;
				c++;
			}
			while(n>0)
			{
				a=n%10;
				sum=(int) (sum+ Math.pow(a, c));
				n=n/10;
			}
			if(b==sum)
				System.out.println(b+" is an armstrong number");
			else
				System.out.println(b+"is not an armstrong number");
		}

	


}
