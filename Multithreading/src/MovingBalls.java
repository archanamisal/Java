import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;


public class MovingBalls extends JFrame implements Runnable {
	
	int x1,y1,x2,y2,x3,y3;
	Thread t1,t2,t3;
	
	public MovingBalls() {
		// TODO Auto-generated constructor stub
		t1=new Thread(this,"red");
		t2=new Thread(this, "blue");
		t3=new Thread(this,"green");
		
		x1=100;
		y1=100;
		x2=300;
		y2=100;
		x3=300;
		y3=500;
		
		t1.start();
		t2.start();
		t3.start();
		
	
		this.setTitle("Moving Balls");
		this.setSize(1500,1500);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.red);
		g.fillOval(x1, y1, 50, 50);
		
		g.setColor(Color.blue);
		g.fillOval(x2, y2, 50, 50);
		
		g.setColor(Color.green);
		g.fillOval(x3, y3, 50, 50);
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			if(Thread.currentThread().getName().equals("red"))
			{
				x1=x1+5;
				synchronized (this) {
					if(x1==300)
				{
					notify();
				}
			}
				try {
					Thread.sleep(100);
					} 
				catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			
			else if(Thread.currentThread().getName().equals("blue"))
			{
				x2=x2+5;
				synchronized (this) {
				if(x2==300)
				{
					try {
						wait();
					}
					catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
				try {
					Thread.sleep(70);
					} 
				catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			
			else if(Thread.currentThread().getName().equals("green"))
			{
				x3=x3+5;
				synchronized (this) {
				if(x3==300)
				{
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} }
				try {
					Thread.sleep(50);
					} 
				catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			repaint();
		}
	}
	
	public static void main(String[] args) {
		new MovingBalls();
	}
}
