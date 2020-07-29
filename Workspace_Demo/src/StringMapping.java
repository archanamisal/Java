
public class StringMapping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s1=new String("java");
			String s2=new String("java");
			if(s1==s2)
			{
				System.out.println("s1==s2   ****true");
			}
			else
			{
				System.out.println("s1==s2    ****false");  // ******answer will be false 
			
	
	
		String s3=new String("java");
		String s4=new String("java");
		if(s3.equals(s4))
		{
			System.out.println("s3.equals(s4)----true"); //*****answer is true 
		}
		else
		{
			System.out.println("s3.equals(s4)----false");  
		}

		
		String s5="java";
		String s6="java";
		if(s5.equals(s6))
		{
			System.out.println("s5.equals(s6)====true"); //*****answer is true 
		}
		else
		{
			System.out.println("s5.equals(s6)===false");  
		}
		
	
		
		
		String s7=new String("java");
		String s8="java";
		if(s7.equals(s8))
		{
			System.out.println("s7.equals(s8)....true"); //*****answer is true 
		}
		else
		{
			System.out.println("s7.equals(s8)....false");  
		}
	
		String s11=new String("java");
		String s12="java";
		if(s11==s12)
		{
			System.out.println("s11==s12)....true"); //*****answer is true 
		}
		else
		{
			System.out.println("s11=="
					+ "s12)....false");  
		}
	
	
		String s9="java";
		String s10="java";
		if(s9==s10)
		{
			System.out.println("s9==s10 ____true"); //*****answer is true 
		}
		else
		{
			System.out.println("s9==s10____false");  
		}
		
		}
	}
}
