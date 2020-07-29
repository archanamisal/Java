package swings;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class MyDialog extends JDialog {
	
	
	JLabel l1;
	JButton b1,b2,b3;
	LoginDemo log;
	public MyDialog(final LoginDemo log)
	{
		this.log=log;
		
		l1=new JLabel("do you really want to save or not?");
		b1=new JButton("cancel");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				log.dispose();
				MyDialog.this.dispose();
				
			}
		});
		
		b2=new JButton("save");
		b3=new JButton("don't save");
		
		this.add(l1);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		
		this.setSize(270,100);
		this.setLayout(new FlowLayout());
		this.setModal(true);
		//this.setModal(false); modeless window
		this.setVisible(true);
		this.setLocation(250, 250);
	}

}
