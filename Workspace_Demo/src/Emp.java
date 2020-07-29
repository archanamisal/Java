
//public final class Emp   //subclasses cannot be created

public class Emp {
	private int id;
	private String name;
	private double salary;
	private MyDate doj;
	
	// final float pi=3.14f; [when we declare variable as final we cannot change the value of that var.(Fixed)]
	
	

	public Emp()
	{
		System.out.println("Default Employee Constructor");
		id=0;
		name="";
		salary=0;
		doj=new MyDate();
	}

	public Emp(int id, String name,double salary, MyDate doj )
	{
		System.out.println("Parameterized Employee Constructor");
		this.id=id;
		this.name=name;
		this.salary=salary;
	 	this.doj=doj;
	}
	@Override
	public String toString() {
		return "id :"+ id +" "   +"name :"+name  +
				" "  +"Salary :"+ salary  +" "  +"Date of Joining :" +doj;
	}
	
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDoj() {
		return doj;
	}

	public void setDoj(MyDate doj) {
		this.doj = doj;
	}

	public double CalculateSalary()
	{
		return salary;
	}
	/*
	final public double CalculateSalary()
	{
		return salary; //method cannot be override
	}*/

/*public static void main(String[] args) {
	MyDate date=new MyDate(1,2,2017);
	//Emp e=new Emp(1,"abc",20000,date);
	
	Emp e=new Emp(1,"abc",20000,date);
	System.out.println(e);
	
//	Emp e1=new Emp(1,"abc",20000);
//	System.out.println(e1);
	
}*/
}
