// wrapper classes are used for "type-Coversion"
public class WrapperDemo {
	public static void main(String[] args) {

		int p=10;
		Integer i1=new Integer(p); //coverted primitive datatype to object also called as "Boxing"
		Integer i2=new Integer("20");
		//Integer  i=p;  
		p=i1.intValue(); //Unboxing
		//System.out.println(i1);
		
		System.out.println(i2);

		//		//******or*****
		
		String str="1234";
		//p=Integer.parseInt(str); 
		//System.out.println(p);
		
		i1=Integer.valueOf(str); //java version 5 feature automatic boxing & unboxing
		System.out.println(i1);
		
		String str1="125.23";
		Float f=Float.parseFloat(str1); 
		System.out.println(f);
		
		

	}

}



