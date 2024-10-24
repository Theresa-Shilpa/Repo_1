package inheritance;

public class Hierarchial2 extends Hierarchial1{
public void display2()
{
	System.out.println("Hierarchial child 1");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchial2 obj=new Hierarchial2();
		obj.display();
		obj.display2();
	}

}
