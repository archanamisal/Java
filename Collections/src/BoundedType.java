//Generic 
public class BoundedType<T extends Number> 
{
		
		T o;
	
		public BoundedType(T o)
		{
			this.o=o;
		}
		
	
		 void display ()
		{
			System.out.println(o.getClass().getName()+"  " +o.toString());
		}
		

		
	
		public static void main(String[] args)
		{
			BoundedType<Number> b=new BoundedType<Number>(1);
			b.display();
			
			
			BoundedType<Number> b1=new BoundedType<Number>(1.2);
			b1.display();
			
		
			
			
		}
}		
		
	


