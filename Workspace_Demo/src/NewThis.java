/*
 Constructor is a instance of class .same name as class name
 does not have any return type (line void or datatype
 used to initilize newly created objects
 and can be overloaded
 class can have more than one constructors
 
 two types: 1)Default(NO argument) 
 			2)Parameterized
 			
this keyword using methods 			
 */


public class NewThis {
	 int day, month,year;
	
	public NewThis()
	{
		day=20;
		month=3;
		year=2018;
	}
	
	public NewThis(int year) //Default Constructor
	{
		//day=month=year=1;
		/*day=20;
		month=2;
		year=2017;*/
		//this(1,20);
		this.year=year;
	}
	public NewThis(int day, int month)
	{
		this.day=day;
		this.month=month;
		
	}
	
	public void display()
	{
		System.out.println("Date ="+day +":"+month +":"+year);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThis n=new NewThis(); //default con called
		n.display();
		NewThis c=new NewThis(02);//one argu con called
		c.display();
		NewThis c1=new NewThis(1,11);//Parametrised Constructor called,
		c1.display();
		
	

	}

}

