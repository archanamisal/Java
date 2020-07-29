//For Inheritance Program class 3 MyDate

public class MyDate {

	private int d,m,y;

	public MyDate() {
		// TODO Auto-generated constructor stub
		d=20;
		m=12;
		y=2017;
	}

	public MyDate(int d, int m, int y) {
		// TODO Auto-generated constructor stub
		this.d=d;
		this.m=m;
		this.y=y;

	}
	
	public void display(){

		System.out.println("Date is ="+d+":"+m+":"+y);
	}

	public static void main(String[] args) {
		MyDate d=new MyDate();
		d.display();
	}
}



//printig date using methods (Functions)

//MyDate itself is a Data Type for date


/*public class MyDate {
	private int d,m,y; //beacuse we dont want to show for security reason(Encapsulation)
	
	public void initDate() //initilize
	{
		d=30;
		m=12;
		y=2017;

	}		//methods are public bcz we want to access that fuctionltiy
	public void printDate() //display
	{
		System.out.println("Date :" + d+"/"   +m+"/"  +y );
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate m=new MyDate();    //object created 
		m.initDate();  // while .m is a reference to object
		m.printDate();
	}

}*/