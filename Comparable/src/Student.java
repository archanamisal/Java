
//public class Student  --->use only for liststudent

public class Student implements Comparable<Student> //used for setStudent  and Comparable
	{ 

	int rollno;
	String nm;
	float marks;

	public Student(int rollno, String nm,float marks )
	{
		this.rollno=rollno;
		this.nm=nm;
		this.marks=marks;

	}

	public int getRoll() {
		return rollno;
	}

	public void setRoll(int roll) {
		this.rollno = roll;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "[Roll No=" + rollno + ", Name=" + nm + ", Marks=" + marks + "]";
	}



	@Override
	public int compareTo(Student s) {
		if(this.rollno>s.rollno)
		{
			return 1;
		}
		else if(this.rollno<s.rollno)
		{
			return -1;
		}
		else return 0;
	}
	{

		/*---------Comparing through marks--------
		 * 
		 * public int compareTo1(Student stu) {
		if(this.marks>stu.marks)
		{
			return 1;
		}
		else if(this.marks<stu.marks)
		{
			return -1;
		}
		else return 0;

	------- comparing through name-----------	
	this.nm.compareTo(s.nm);
		 */



	}
}

