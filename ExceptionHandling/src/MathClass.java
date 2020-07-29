import java.util.InputMismatchException;
import java.util.Scanner;


public class MathClass {

	
		public static void Divide()
		{
		int n1,n2;
		System.out.println("Enter two Numbers :");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int res;
		
		try{
			n1=sc.nextInt();
			n2=sc.nextInt();
			res=n1/n2;
			System.out.println("Division is ="+res);
		
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally{
			System.out.println("Finally Block Exceuted ! ! !");
		}
			System.out.println("Further Code Executed ! ! !");
	}
		
		public static void main(String[] args) {
				Divide();
		}
		
}
