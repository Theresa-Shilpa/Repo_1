package exception;

public class Eg_customExcep {

	public static void main(String[] args) throws ShowException {
		// TODO Auto-generated method stub
 
		int age=17;
		if(age>=18)
		{
			System.out.println("eligible");
		}
		else
		{
			throw new ShowException("Invalid age");
		}
	}

}
