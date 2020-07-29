public class Student{

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
}

