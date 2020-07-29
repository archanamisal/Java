import java.io.FileInputStream;
import java.io.FileNotFoundException; //-----Business Logic Declration 


public class ReadFile {

	@SuppressWarnings({ "unused", "resource" })
	public static void read() throws FileNotFoundException
	{
		
		FileInputStream fi=new FileInputStream("MathClass.java");

		/*try{
		FileInputStream fi=new FileInputStream("hello");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();

		}*/

	}

	public static void main(String[] args) {

		//read();
		try {
			read();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
