

/* multiple operations using fuctions */
public class Maths {
	int a=20,b=30, sum;
	public void add()
	{
		sum=a+b;
		System.out.println("addition of two numbers"+sum);
	}

	public void sub()
	{
		sum=a-b;
		System.out.println("substrction is " +sum);
	}
	
	public void mul()
	{
	sum=a*b;
	System.out.println("multiplication is" +sum);
	}
	
	public void div()
	{
		sum=a/b;
		System.out.println("division is" +sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths a=new Maths(); //object creation
		a.add(); // calling function 
		Maths s=new Maths();
		s.sub();
		Maths m=new Maths();
		m.mul();
		Maths d=new Maths();
		d.div();
		
		

	}

}
