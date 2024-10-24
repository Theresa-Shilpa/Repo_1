package accessModifier_eg;

public class Eg_accessModifier1 {

	public void display1()
	{
		System.out.println("This is a public access modifier");
	}
	private void display2()
	{
		System.out.println("This is a private access modifier");
	}
	protected void display3()
	{
		System.out.println("This is a protected access modifier");
	}
	void display4()
	{
		System.out.println("This is a default access modifier");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eg_accessModifier1 obj=new Eg_accessModifier1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}

}
