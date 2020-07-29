//print numbers 1-100 using function


public class Numbers {

	public void num() //user define fun/method
	{
		for(int i=0;i<=90;i++)
		System.out.println(" "+i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<=100;i++)
			System.out.println("  "+i);*/
		
		Numbers n=new Numbers(); //object creation
		n.num(); //calling function
		
		}
}
