import java.util.SortedSet;
import java.util.TreeSet;


public class SetStudent {
	public static void main(String[] args) 
	{
		Student s1=new Student(112, "Archana", 600);
		Student s2=new Student(10, "Rchana", 600);
		Student s3=new Student(20, "Jay", 600);
		Student s4=new Student(50, "Vijay", 600);
		Student s5=new Student(00, "Ajay", 600);
		Student s6=new Student(11, "Jo", 600);
		
		SortedSet<Student> set=new TreeSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		for(Student s:set)
		{
			System.out.println("Student Details :"+s);
		}

	}
}