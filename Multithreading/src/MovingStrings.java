import java.awt.Graphics;

import javax.swing.JFrame;


public class MovingStrings extends JFrame implements Runnable {
	
	int x1,y1,x2,y2;
	Thread t1,t2;
	public MovingStrings()
	{	
		t1=new Thread(this,"left");
		//t1.setPriority(10);
		t2=new Thread(this,"right");
		//t2.setPriority(1);
		
		x1=100;
		y1=100;
		x2=500;
		y2=500;
		t1.start();
		t2.start();
		
	
		this.setTitle("Moving Strings");
		this.setSize(500,500);
		this.setVisible(true);
}
	
	public void Paint(Graphics g) //method of thread /runnable
	{
		super.paint(g);
		g.drawString("hello", x1, y1);
		g.drawString("world", x2, y2);
	}
	@Override
	public void run() {
		while(true)
		{
			if(Thread.currentThread().getName().equals("left"))
			{
				x1=x1+5;
			}
			else if(Thread.currentThread().getName().equals("right"))
			{
				x2=x2-5;
			}
			
			repaint();
			
			/*try{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}*/
			
		}
	}
public static void main(String[] args) {
	new MovingStrings();
}
}
