package basejava;

public class Detail {
	public static void main(String[] args)
	{
		System.out.println("Details of student");
		Detail obj=new Detail();
		obj.personal();
		obj.education();
		System.out.println("*******************************************************");
		Internship s=new Internship();
		s.company();
	}
	void personal()
	{
		System.out.println("Name : Amalendu A");
		System.out.println("Age : 22");
	}
	void education()
	{
		System.out.println("Name : Amalendu A");
		System.out.println("Age : 22");
	}
}
