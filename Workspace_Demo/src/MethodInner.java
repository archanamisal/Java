//3--- Type ---Method local inner classs



//creating class inside the method 


public class MethodInner 
{
	private  int p=10;


	public void display()
	{
		final int q=90;

		class Demo
		{

			public void print()
			{
				System.out.println("Method/ Local Inner Class  "  +p +","  +q);
			}

		}

		Demo d1=new Demo();
		d1.print();
	}

	public static void main(String[] args) 
	{
		MethodInner i=new MethodInner();
		i.display();
	}
}




