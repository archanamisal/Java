/*method overloading 
 code/method reusability
 same method different signatures(no of arguments , datatypes , sequence of arguments
 a class can have multiple methods 
 */
public class Overloading {
	
	public void add(int a,int b)
	{
		int sum;
		sum=a+b;
	System.out.println("Sum is : "+sum);
	}
	
	public void add(int a,int b,int c)
	{
		int sum;
		sum=a+b+c;
	System.out.println("Sum is : "+sum);
	}
	
	public void add(int a,int b,float c)
	{
		float sum;
		sum=a+b+c;
	System.out.println("Sum is : "+sum);
	}
	public void add(float a,int b,int c)
	{
		float sum;
		sum=a+b+c;
	System.out.println("Sum is : "+sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o=new Overloading();
		o.add(20, 30);
		o.add(10.5f, 5, 57);
		o.add(20, 4, 4.3f);
		o.add(20, 80, 15);
		

	}

}
