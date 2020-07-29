//printig date using methods (Get and Set  or Accessor/getter Muted/Setter)


public class UpdateDate {
	private int d,m,y; //beacuse we dont want to show for security reason(Encapsulation)
	
	public void initDate()
	{
		d=30;
		m=12;
		y=2017;

	}		//methods are public bcz we want to access that fuctionltiy
	public void printDate()
	{
		System.out.println("Date :" + d+"/"   +m+"/"  +y );
		
	}
	public int getDay()  //int (data type) because date is integer type and we are getting date
	{
		return d;
	}
	public int getMonth()
	{
		return m;
	}
	public int getYear()
	{
		return y;
	}
	
	public void setDay(int day) //void beacuse we are getting any data we are setting/updating it
	{
		d=day;
	}
	
	public void setMonth(int mon)
	{
		m=mon;
	}
	public void setYear(int year)
	{
		y=year;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpdateDate m=new UpdateDate();    //object created 
		m.initDate();  // while .m is a reference to object
		m.printDate();
		
		//print get deatils
		int a1=m.getDay();
		System.out.println("Day :"+a1);
		int a2=m.getMonth();
		System.out.println("Month :"+a2);
		int a3=m.getYear();
		System.out.println("Year :"+a3);
		
		//set method calling
		m.setDay(25);
		m.setMonth(03);
		m.setYear(2018);
		m.printDate();
	}

}
