
//before java version  5 this is how we used to write code
public class PreGen {
	
	
	Object o;
	public PreGen(Object o)
	{
		this.o=o;
	}
	
	public Object getObj()
	{
		return o;
	}
	
	
	public static void main(String[] args) {
		PreGen p=new PreGen(new Integer(100));
		Integer i=(Integer)p.getObj();   //explicit type casting is needed
		
		PreGen p2=new PreGen(new String("Hello World ! ! !"));
		String s=(String)p2.getObj();
		
		p=p2; //p2 value getting stored in p ---right to left assignment operator

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
