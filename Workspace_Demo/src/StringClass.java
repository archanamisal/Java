
public class StringClass {

	public static void main(String[] args) {
	
		
		/*String s="seed"; //First class notation
		System.out.println(s);
		//output will be =seed
	
		// String s1=new String("Seed"); //normal notation (n number of copies/objects get created
		
		*/
		
		
		String str="seed";
		System.out.println(str);
		
		//str.concat("new"); //it will point to only existing string named str=seed o/p will be seed 
		
		str=str.concat(" Infotech");  //str.conct is a method used to concat strings o/p will be seedInfotech
		
		//all these are immutable methods [only single object is created]
		
		System.out.println(str);
		System.out.println("Length ! ! ! :" +str.length());  
		System.out.println("At to particular Character ! ! ! :" +str.charAt(2));  
		System.out.println("Comparision ! ! ! :"+str.compareTo("Archana"));
		System.out.println("Lowercase ! ! !  "+str.toLowerCase());
		System.out.println("Uppercase ! ! ! :"+str.toUpperCase());
		System.out.println("Trim ! ! ! : "+str.trim());
		System.out.println("Count : "+str.indexOf(0));
		
		
		//Mutable methods (Every time new object will get created
		
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("SEED");
		//System.out.println(sb);
		System.out.println(sb.toString());
		
		// ============or===============
		
		StringBuilder sb1=new StringBuilder("Hello");
		sb1.append("World");
		System.out.println(sb1.toString());
		
	}
}
