package inheritance;

public class Hierarchial3Child2 extends Hierarchial2{
public void display3()
{
	System.out.println("Hierarchial child 2");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchial3Child2 obj=new Hierarchial3Child2();
		obj.display(); //no relation btw B and C child classes
		obj.display3();
	}

}
