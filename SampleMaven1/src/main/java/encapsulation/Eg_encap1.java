package encapsulation;

public class Eg_encap1 {
private int age;
private String name;
public void setter(int age,String name)
{
	this.age=age;
	this.name=name;
}
public void getter()
{
	System.out.println(age + " "+name);
}
}
