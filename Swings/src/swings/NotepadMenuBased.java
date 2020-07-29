package swings;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NotepadMenuBased extends JFrame {
	
	JMenuBar mbar;
	JMenu file;
	JMenu edit;
	JMenuItem newf,save,copy,cut,paste,close;
	JTextArea txtarea;
	JScrollPane pane;
	JPopupMenu pmenu;
	JMenuItem copy1,cut1,paste1,color;

	
	
	public NotepadMenuBased()
	{	
		mbar=new JMenuBar();
		this.setJMenuBar(mbar);
		
		txtarea=new JTextArea();
		this.add(txtarea);
		
		pane=new JScrollPane(txtarea);
		this.add(pane);
		
		file=new JMenu("File");
		edit=new JMenu("Edit");
		
		newf=new JMenuItem("New File");
		newf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				NotepadMenuBased np=new NotepadMenuBased();
			}
		});
		save=new JMenuItem("Save");
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFileChooser jf=new JFileChooser(".");
				int p=jf.showSaveDialog(NotepadMenuBased.this);
				System.out.println("Value of p="+p);
			}
		});
		
		copy=new JMenuItem("Copy");
		copy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txtarea.copy();
			}
		});
		
		cut=new JMenuItem("Cut");
		cut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txtarea.cut();
			}
		});
		
		
		paste=new JMenuItem("Paste");
		paste.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txtarea.paste();
			}
		});
		
		close=new JMenuItem("Exit");
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				NotepadMenuBased.this.dispose();
			}
		});
		
		
		
		pmenu=new JPopupMenu();
		copy1=new JMenuItem("Copy");
		copy1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txtarea.copy();
			}
		});

		cut1=new JMenuItem("Cut");
		cut1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txtarea.cut();

			}
		});

		paste1=new JMenuItem("Paste");
		paste1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txtarea.paste();
			}
		});

		color=new JMenuItem("Select Colour");
		pmenu.add(copy1);
		pmenu.addSeparator();
		pmenu.add(cut1);
		pmenu.addSeparator();
		pmenu.add(paste1);
		pmenu.addSeparator();
		pmenu.add(color);
		color.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Color cs=JColorChooser.showDialog(NotepadMenuBased.this,"Select Colour",Color.red);
				txtarea.setBackground(cs);
				//txtarea.setForeground(cs);

			}
		});

		
		
		
		mbar.add(file);
		mbar.add(edit);
		
		file.add(newf);
		file.addSeparator();
		file.add(save);
		file.addSeparator();
		file.add(close);
		
		edit.add(copy);
		edit.addSeparator();
		edit.add(cut);
		edit.addSeparator();
		edit.add(paste);
		
		txtarea.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.isPopupTrigger())
					pmenu.show(e.getComponent(), e.getX(), e.getY());
			}


			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

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
				int p=JOptionPane.showConfirmDialog(NotepadMenuBased.this, "Do you really want to close without saving ?");

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

		
		this.setTitle("notepad");
		this.setSize(500,500);
		this.setVisible(true);
	
	}
	public static void main(String[] args) {
		new NotepadMenuBased();
	}
}