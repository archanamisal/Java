/* instead if disply method   */


public class ToString {

	
	
	private int d,m,y; //beacuse we dont want to show for security reason(Encapsulation)
	
	public ToString() //initilize
	{
		d=30;
		m=12;
		y=2017;

	}		//methods are public bcz we want to access that fuctionltiy
	
	public ToString(int d, int m, int y)
	{
		this.d=d;
		this.m=m;
		this.y=y;
	}
	
	public String toString()//display
	{
		return "Date :" + d+"/"   +m+"/"  +y ;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToString m=new ToString();    //object created 
		System.out.println(m);
		ToString m1=new ToString(20,12,2017);    //object created 
		System.out.println(m1);
		
		
	}

}