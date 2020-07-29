package swings;
//normal just frame of the login without any button operation

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

	public class Login extends JFrame {
	
		JLabel user,pass;
		JTextField txt1;		//created reference of the object and identified things which needs to be used 
		JPasswordField pass1;
		JButton submit,clear,cancel;
		JPanel p1,p2,p3;
		
		public Login()//Constructor
		{
			user=new JLabel("Username ");
			pass=new JLabel ("Password");
			txt1=new JTextField(20);
			pass1=new JPasswordField(20);
			submit=new JButton("SUBMIT");
			clear=new JButton("RESET ");
			cancel=new JButton("CANCEL");
			p1=new JPanel(new GridLayout(2,2));  //created objects
			p2=new JPanel();
			p3=new JPanel(new GridLayout(3,1));
			
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
			this.setSize(500,250);
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			
			}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();
	}

}
