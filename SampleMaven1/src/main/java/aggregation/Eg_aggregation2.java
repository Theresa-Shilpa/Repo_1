package aggregation;

public class Eg_aggregation2 {
int age;
String city;
Eg_aggregation1 z;//aggregation process, ref var

	public Eg_aggregation2(int age,String city,Eg_aggregation1 z)
	{
		this.age=age;
		this.city=city;
		this.z=z;
	}
	public void display()
	{
	System.out.println(z.name+ " "+z.rollNo+" ");
	System.out.println(age+ " "+city+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eg_aggregation1 obj=new Eg_aggregation1("Shilpa", 4);
		Eg_aggregation2 obj1=new Eg_aggregation2(26,"Punalur",obj);
		obj1.display();
	}

}
