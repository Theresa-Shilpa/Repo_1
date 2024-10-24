package exception;

public class Eg_nullPointerExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
String a=null;
System.out.println(a.length());
		}
		catch(NullPointerException e)
		{
			String b="THERESA";
			System.out.println(b.length());
		}
	}

}
