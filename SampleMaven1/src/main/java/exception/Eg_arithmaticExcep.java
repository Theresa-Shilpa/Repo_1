package exception;

public class Eg_arithmaticExcep {

	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		/*catch(ArithmeticException r)
		{
			a=10;
			b=15;
			System.out.println(a/b);
			System.out.println(r);
		}*/
		finally
		{
			System.out.println("Heyy dude!!!!");
		}
	}
}
