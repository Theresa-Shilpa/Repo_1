package superKeyword;

public class Child_instMethod extends Parent_instMethod{

	public void display2()
	{
		System.out.println("Child class coming");
		super.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child_instMethod obj=new Child_instMethod();
		obj.display2();
	}

}
