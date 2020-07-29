package swings;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

	public class LoginDemo extends JFrame {
		
	
		JLabel user,pass;
		JTextField txt1;		//created reference of the object and identified things which needs to be used 
		JPasswordField pass1;
		JButton submit,clear,cancel;
		JPanel p1,p2,p3;
		
		public LoginDemo()//Constructor
		{
			user=new JLabel("Username ");
			pass=new JLabel ("Password");
			txt1=new JTextField(20);
			pass1=new JPasswordField(20);
			
			submit=new JButton("SUBMIT");
			submit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String usr=txt1.getText();
					String pas=pass1.getText();
					
					if(usr.equals("archana")&& pas.equals("xyz"))
					{
						JOptionPane.showMessageDialog(LoginDemo.this, "Authenticated Successfully ! ! !");
					}
					else
					{
						JOptionPane.showMessageDialog(LoginDemo.this, "Authentication Failed ! ! !");
					}
					
				}
			});
			
			clear=new JButton("RESET ");
			clear.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					txt1.setText(" ");
					pass1.setText(" ");
					
				}
			});
			
			cancel=new JButton("Cancel");
			cancel.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					//LoginDemo.this.dispose();
					MyDialog md1=new MyDialog(LoginDemo.this);
				}
			});
			
			this.addWindowListener(new WindowListener() {
				
				@Override
				public void windowOpened(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowIconified(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeiconified(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowClosing(WindowEvent arg0) {
					// TODO Auto-generated method stub
					MyDialog md=new MyDialog(LoginDemo.this);
				}
				
				@Override
				public void windowClosed(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void windowActivated(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			});
			
			
			p1=new JPanel(new GridLayout(2,2));  //created objects
			p2=new JPanel();
			p3=new JPanel(new GridLayout(2,1));
			
			//adding on the panel
			p1.add(user);
			p1.add(txt1);
			p1.add(pass);
			p1.add(pass1);
			
			p2.add(submit);
			p2.add(clear);
			p2.add(cancel);
			
			p3.add(p1);
			p3.add(p2);
			
			this.add(p3);
			this.setLayout(new FlowLayout());
			this.setTitle("Login Window");
			this.setSize(500,500);
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			
			}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginDemo();
	}

}
