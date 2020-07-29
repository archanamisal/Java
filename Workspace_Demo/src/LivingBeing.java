//ain method of Animal-Tiger-Elephant
public class LivingBeing {

	public static void main(String[] args) {
		
		//(a. is a reference of animal class which is static object )	
		Animal a=new Tiger(); //object tiger class (which is dynamic type of obj)
		a.eat();//Reference variable calling achieved
		
		//(a. is a reference of animal class which is static object )
		Animal a1=new Elephant(); //object tiger class (which is dynamic type of obj
		a1.eat();
		
		
		//Instance of operator
		
		//used to check which obj is being called at runtime
		
		if(a instanceof Tiger )
		{
			System.out.println("Instance of TIGER method is called"); //true
		}
		else if(a instanceof Elephant)
		{
			System.out.println("Instance of ELEPHANT method is called"); //false
		}
		
	}

	

}
