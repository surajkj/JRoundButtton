/*This is the main class*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JavaBean extends JFrame
{
	JRoundButton rb1,rb2,rb3;
	JTextField jtfmsg;
	Container c;
	JavaBean()
	{
		super("Java Round Button");
		setSize(500,500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		getContentPane();

		rb1=new JRoundButton("OK");
		rb1.setBounds(10,10,50,50);
		rb1.addActionListener(new Okhandler());
		c.add(rb1);

		rb2=new JRoundButton("ON");
		rb2.setBounds(150,10,50,50);
		rb2.addActionListener(new Onhandler());
		c.add(rb2);

		rb3=new JRoundButton("OFF");
		rb3.setBounds(250,10,50,50);
		rb3.addActionListener(new Offhandler());
		c.add(rb3);

		jtfmsg=new JTextField();
		jtfmsg.setBounds(100,120,120,30);
		c.add(jtfmsg);

		setVisible(true);
	}
	public class Okhandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
				{
					jtfmsg.setText("OK Pressed");
				}
	}
	public class Onhandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
				{
					jtfmsg.setText("ON Pressed");
				}
	}
	public class Offhandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
				{
					jtfmsg.setText("OFF Pressed");
				}
	}
	public static void main(String[] args)
	{
		try
		{
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			JavaBean jb=new JavaBean();
		}
		catch (Exception e)
		{
			System.out.println("Failed to Load LNF");
		}
		
	}
}
