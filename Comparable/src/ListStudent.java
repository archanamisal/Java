import java.util.ArrayList;
import java.util.List;



public class ListStudent {
	public static void main(String[] args) {
		Student s1=new Student(112, "Archana", 600);
		Student s2=new Student(10, "Rchana", 600);
		Student s3=new Student(20, "Jay", 600);
		Student s4=new Student(50, "Vijay", 600);
		Student s5=new Student(00, "Ajay", 600);
		Student s6=new Student(11, "Jo", 600);
		
		List<Student> li=new ArrayList<>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		li.add(s6);
		for(Student si:li)
		{
			System.out.println("Student Details :"+si);
		}
		
		
	
		
		
		
	}

}
