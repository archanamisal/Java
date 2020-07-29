//1]---simple inner class 
public class SimpleInner {
	private int  num1,num2;

	public SimpleInner()
	{

		num1=10;
		num2=20;

	}

	public class Inner
	{
		private int num3;
		
		public  Inner()
		{
			num3=30;
		}
		
		public void display()
		{
			
			System.out.println("Simple Inner Class :" +num1 +" : " +num2 +" :"+num3);
		}
	}
		
		public static void main(String[] args) {
			
			SimpleInner o=new SimpleInner();
			Inner i=o.new Inner();
			i.display();
		}
	}


