public class Manager extends Emp
{
	private double da,hra;

	public Manager()
	{
		super();
		System.out.println("Default Manager Constructor");
		da=0;
		hra=0;
	}
	public Manager(int id, String name,double salary, MyDate doj,double da,double hra)
	{
		super(id,name,salary,doj);
		System.out.println("Parameterized Manager Constructor");
		this.da=da;
		this.hra=hra;
	}
	/*@Override
	public String toString() {
		return super.toString()+"DA="   +da     +"HRA=" +hra;
	}*/
	
	
	
	
	public double CalculateIncentives()
	{
		return getSalary()+da+hra;
	}
	@Override
	public String toString() {
		return "Manager [da=" + da + ", hra=" + hra + ", CalculateIncentives()=" + CalculateIncentives()
				+ ", toString()=" + super.toString() + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getSalary()=" + getSalary() + ", getDoj()=" + getDoj() + ", CalculateSalary()="
				+ CalculateSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Emp e=new Emp(02,"Kanak",22000,new MyDate(2,4,2017));
		//System.out.println(e);
	
		Manager m=new Manager(1,"Archana", 10000, new MyDate(1,2,2017) ,5000,6000);
		 //to string method called

		double s=m.CalculateSalary();
		double i=m.CalculateIncentives();


		System.out.println("Salary :"+s);
		System.out.println("Incentives:"+i);
		System.out.println(m);


	}

}
