import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileDemo {
	 @SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//File f= new File("MyFile.txt");
		
		File f=new File("D:\\Seed\\Java\\JavaIO Package\\MyFile.txt");
		
		if(f.exists())
		{
			System.out.println("File Exists ! ! !");
		}
		
		else
		{
			System.out.println("File Not Exist ! ! !");
			f.createNewFile();  //<-------> Creating New File
		}
		
		
		System.out.println("Length ="+f.length());
		System.out.println("Can Read ="+f.canRead());
		System.out.println("Can Write="+f.canWrite());
		System.out.println("Get Absolute Path="+f.getAbsolutePath());
		System.out.println("Is Absolute Path="+f.isAbsolute());
		
		FileInputStream fis=new FileInputStream(f); //------For rEADING tHE FILE
		int p;
		while ((p=fis.read())!=-1)
		{
			System.out.println((char)p);
		}
		
		System.out.println("Enter Data On Console");
		
		FileOutputStream fout=new FileOutputStream(f); //-----for writing data into the file
		while((p=System.in.read())!='\n')
		{
			fout.write(p);
		}
		
	}

}
