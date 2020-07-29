
//before java version  5 this is how we used to write code
public class NonGen {
	
	
	Object o;
	public NonGen(Object o)
	{
		this.o=o;
	}
	
	public Object getObj()
	{
		return o;
	}
	
	
	public static void main(String[] args) {
		NonGen p=new NonGen(new Integer(100));
		p.getObj();   
		
		NonGen p2=new NonGen(new String("Hello World ! ! !"));
		p2.getObj();
		
		p=p2; //p2 value getting stored in p ---right to left assignment operator

		if(p.getObj()instanceof Integer)
		{
			
		
			System.out.println(p);
		}
		
		if(p2.getObj() instanceof String)
		{
			
			System.out.println(p2);
			
		}
	}
	
	
}
