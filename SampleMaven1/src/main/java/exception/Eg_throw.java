package exception;

public class Eg_throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=17;
if(age>=18)
{
	System.out.println("eligible");
}
else
{
	throw new ArithmeticException("Invalid age");
}
	}

}
