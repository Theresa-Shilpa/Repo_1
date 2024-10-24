package superKeyword;

public class Eg_instVar2 extends Eg_instVar1{

	String colour="Red";
	public void display()
	{
		System.out.println(colour);
		System.out.println(super.colour); //super keyword for bringing parent prop
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eg_instVar2 obj=new Eg_instVar2();
		obj.display();
	}

}
