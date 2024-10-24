package inheritance;

public class SingleChild extends SingleParent{
public void display2()
{
	System.out.println("This is my Single inheritance child class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild obj=new SingleChild();
		obj.display();
		obj.display2();
	}

}
