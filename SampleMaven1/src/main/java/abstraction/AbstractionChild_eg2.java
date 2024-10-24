package abstraction;

public class AbstractionChild_eg2 extends Abstraction_eg1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionChild_eg2 obj=new AbstractionChild_eg2();
		obj.display();
		obj.add();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=5;
		int b=7;
		int c=a+b;
		System.out.println(c);
	}

}
