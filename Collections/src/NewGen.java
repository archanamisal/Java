//Generic 
public class NewGen<T> 
{
		
		
		T o;
		public NewGen(T o)
		{
			this.o=o;
		}
		
		public T getObj()
		{
			return o;
		}
		
		
		public static void main(String[] args)
		{
			NewGen<Integer> p=new NewGen<Integer>(new Integer(100));
			Integer i=p.getObj();   
					
			NewGen<String> p2=new NewGen<String>(new String("Hello World ! ! !"));
			String s=p2.getObj();
			
//			System.out.println(i);
//			System.out.println(s);
			
			//p=p2; {in new version this is not allowed }//p2 value getting stored in p ---right to left assignment operator

			if(p.getObj()instanceof Integer)
			{
				
				i=(Integer)p.getObj();
				System.out.println(i);
			}
			
			if(p2.getObj() instanceof String)
			{
				s=(String)p2.getObj();
				System.out.println(s);
				
			}
		}
		
		
	}


