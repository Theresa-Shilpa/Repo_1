package accessModifier_eg;

public class Eg_accessModifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eg_accessModifier1 obj=new Eg_accessModifier1();
		obj.display1();
		//obj.display2()-bcs it is private access modifier, and not visible for other classes.
		obj.display3();
		obj.display4();
	}

}
