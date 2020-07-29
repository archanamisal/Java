
public class MyThread implements Runnable   //Thread
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++)
		{
			System.out.println("Thread="+Thread.currentThread().getName()+"--"+i);
			
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		MyThread m=new MyThread();
		Thread t1=new Thread(m,"First");  //os gets it randomly
		Thread t2=new Thread(m,"Second");
		t1.start();
		t2.start();
		//t1.setName("me");
	}
	

}
