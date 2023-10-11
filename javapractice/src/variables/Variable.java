package variables;

public class Variable {
	int a=10;
	int b=5;
	public static void main(String[] args)
	{
		Variable obj=new Variable();
		obj.findSum();
		Vari ob=new Vari();
		ob.findDiff();
		obj.chara();
	}
	void findSum()
	{
		System.out.println(a+b);
	}
	void chara()
	{
		char c='a';
        System.out.println(c);
	}

}
