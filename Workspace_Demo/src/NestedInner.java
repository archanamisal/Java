//2---- STATIC /NESTED INNER CLASS

public class NestedInner {

	private static int num1;
	private static int num2;
	
	static //keyword
	{
		num1=20;
		num2=30;
	}
	
	
	static class Inner //nested static class
	{
	private int num3;
	
	public Inner() //constructor
	{
		num3=80;
	}
	public void display() //method
	{
		
		System.out.println("Nested Inner Class ! ! !" +num1 +","+num2  +", "+num3);
	}
}

public static void main(String[] args) {
	Inner i=new Inner();
	i.display();
	
}
}
