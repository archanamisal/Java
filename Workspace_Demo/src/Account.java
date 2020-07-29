
public class Account {
	int accno;
	String owname;
	double bal;
	
	public void initAccount()
	{
		accno=22200222;
		owname="Archana";
		bal=50000;
		
	}
	
	public void displayAccount()
	{
		System.out.println("Account Deatils are :" +accno+" " +owname+" " +bal);
	}
	
	public int getAccount()
	{
		return accno;
	}
	public String getOwname()
	{
		return owname;
	}
	public double getBal()
	{
		return bal;
	}
	 public void setAccount(int ano)
	 {
		 accno=ano;
	 }
	public void setOname(String nm)
	{
		owname=nm;
	}
	public void setBal(double b)
	{
		bal=b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		a.initAccount();
		a.displayAccount();
		
		//get method calling
		int a1=a.getAccount();
		System.out.println("Account no :"+a1);
		String a2=a.getOwname();
		System.out.println("Owner Name :"+a2);
		double a3=a.getBal();
		System.out.println("Balance :"+a3);
		
		//set method calling
		a.setAccount(325645225);
		a.setOname("Monica");
		a.setBal(600000);
		a.displayAccount();
	}

}
