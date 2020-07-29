/*
 Constructor is a instance of class .same name as class name
 does not have any return type (line void or datatype
 used to initilize newly created objects
 and can be overloaded
 class can have more than one constructors
 
 two types: 1)Default(NO argument) 
 			2)Parameterized
 */


public class Constructor {
	 int day, month, year;
	
	public Constructor() //Default Constructor
	{
		//day=month=year=1;
		day=20;
		month=2;
		year=2017;
	}
	public Constructor(int d, int m, int y)
	{
		day=d;
		month=m;
		year=y;
	}
	
	public void display(){
		
		System.out.println("Date is ="+day+":"+month+":"+year);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor();//default Constructor called
		c.display();
		Constructor c1=new Constructor(1,11,2017);//Parametrised Constructor called,
		c1.display();
	

	}

}

