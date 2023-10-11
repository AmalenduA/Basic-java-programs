package operator;

public class Oper {
	public static void main(String[] args) 
	{
		int x=10;
		int y=10;
		System.out.println((x--)*y);
		System.out.println((--y)*y);
		System.out.println((--y)+(x--));
		System.out.println((--y)+(--x));
		System.out.println((--y)*(x--));
		System.out.println(y);
		System.out.println(x);
		System.out.println(x-y);
		System.out.println((++x)+(--y)*x);
		System.out.println((x--)*y);
		System.out.println((--y)*y);
		System.out.println((--y)+(x++));
		System.out.println((++y)+(--x));
		System.out.println((y--)+(x--));
		System.out.println(y);
		System.out.println(x);
	}

}
