
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10, flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=0; break;
			}
			else 
			
				flag=1;
			}
		if(flag==0)
		{
			System.out.println("Not Prime");
		}
			else
				System.out.println(" prime");
		}
		
}
