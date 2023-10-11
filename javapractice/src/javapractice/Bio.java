package javapractice;

public class Bio {
	public static void main(String[] args)
	{
		System.out.println("Biodata");
		Bio obj1=new Bio();
		obj1.pers();
		obj1.edu();
		System.out.println("************************************************************");
		Company s=new Company();
		s.comp();
		s.course();
		System.out.println("************************************************************");
		First_prg f=new First_prg();
		f.start();
	}
	void pers()
	{
		System.out.println("Name : Amalendu A");
		System.out.println("Age : 22");
	}
	void edu()
	{
		System.out.println("Qualification : BTech");
		System.out.println("Year : 2023");
	}

}
