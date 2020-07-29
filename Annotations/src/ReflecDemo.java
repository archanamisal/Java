import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* can be done using METHODS,CONSTRCTORS,CLASS(FIELDS) AND ANNONATTIONS */
	public class ReflecDemo {
		@SuppressWarnings("rawtypes")
		public static void main(String[] args) throws ClassNotFoundException {
		Class c=Class.forName("java.lang.String");
		Method[]arr=c.getMethods();
		Method[]arr1=c.getDeclaredMethods();
		for(Method m:arr)
		{
			System.out.println("-------using Methods------"+m);
		}

		for(Method m1:arr1)
		{
			System.out.println("-------Declared Methods-------"+m1);
		} 


		System.out.println(" *********Using Fields*********** ");
		Field[]f=c.getFields();
		Field[]f1=c.getDeclaredFields();
		for(Field fe:f)
		{
			System.out.println("-------Fields------"+fe);
		}
		for(Field ffe:f1)
		{
			System.out.println("-------Declared Field------"+ffe);
		}

		System.out.println(" *********Using Constructors*********** ");		
		Constructor [] con=c.getConstructors();
		Constructor [] con1=c.getDeclaredConstructors();

		for(Constructor cs:con)
		{
			System.out.println("-------Fields------"+cs);
		}
		for(Constructor cs1:con1)
		{
			System.out.println("-------Declared Field------"+cs1);
		}

	}

}

	