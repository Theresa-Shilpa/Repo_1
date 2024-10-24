package polymorphism;

public class Eg_polymor2 extends Eg_polymor1
{
	public void display(int a,int b) 
	{
		super.display(23, 45);
	int c=a+b;
	System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eg_polymor2 obj=new Eg_polymor2();
		obj.display(34, 56);
	}

}
