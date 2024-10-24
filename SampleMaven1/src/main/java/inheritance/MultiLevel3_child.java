package inheritance;

public class MultiLevel3_child extends MultiLevel2 {
public void display3()
{
	System.out.println("This is class C");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevel3_child obj=new MultiLevel3_child();
		obj.display();
		obj.display2();
		obj.display3();
	}

}
