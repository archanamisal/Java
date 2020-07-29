
public class Factorial {
	
	
public static int fact(int n)
{
	int f=1,i;
	if(n<0)
	{
		System.out.println("number is negative");
		return 0;
	}
	else
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
	return f;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factorial f=new Factorial();
		int res=Factorial.fact(5);
		System.out.println("Factorial of number is :"+res);
		

	}

}
