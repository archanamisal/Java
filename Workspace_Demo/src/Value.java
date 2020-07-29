/* java supports only call by value method*/
public class Value {
	
public static void swap(int n1,int n2)
{
	int temp;
	temp=n1;
	n1=n2;
	n2=temp;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=20,n2=52;
		Value.swap(n1, n2);
		System.out.println("After Swapping");
		System.out.println("number 1 is :"+n1);
		System.out.println("number 2 is :"+n2);
	}

}
