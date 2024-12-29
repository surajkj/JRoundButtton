/*This is the Round Button Class*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JRoundButton extends JComponent implements MouseListener
{
	String text;
	boolean down,exicited;
	int cx,cy,rad;
	ActionListener al;
	ActionEvent ae;
	public JRoundButton()
	{
		text="";
		init();
	}
	public JRoundButton(String text)
	{
		this.text=text;
		init();
	}
	public void init()
	{
		cx=cy=28;
		rad=26;
		setSize(56,56);
		addMouseListener(this);
		ae=new ActionEvent(this,0,"");
	}
	public void addActionListener(ActionListener al)
	{
		this.al=al;	
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		
		if(!down)
		{
			g.setColor(Color.white);
			g.fillOval(3,3,50,50);
			g.setColor(Color.gray);
			g.fillOval(5,5,50,50);
			g.setColor(getBackground());
			g.fillOval(4,4,50,50);
		}
		else					
		{
			g.setColor(Color.gray);
			g.fillOval(3,3,50,50);
			g.setColor(Color.white);
			g.fillOval(5,5,50,50);
			g.setColor(getBackground());
			g.fillOval(4,4,50,50);
		}
		if(!exicited)
	{
		down=true;
		g.setColor(Color.red);
		g.drawString(text,23,30);
	}
	else
	{
		down=false;
		g.setColor(Color.black);
		g.drawString(text,23,30);
	}

	}
	
	public void mousePressed(MouseEvent e)
	{
		int x,y,dx,dy,dist;
		x=e.getX();
		y=e.getY();
		dx=cx-x;
		dy=cy-y;
		dist=(int)(Math.sqrt(dx*dx+dy*dy));
		if(dist<=rad)
		{
			down=true;
			repaint();
		}
		
	}
	public void mouseReleased(MouseEvent e)
	{
			down=false;
			repaint();
			al.actionPerformed(ae);
	}
	public void mouseClicked(MouseEvent e)
	{
	}
	public void mouseEntered(MouseEvent e)
	{
		
	}
	public void mouseExited(MouseEvent e)
	{
		
	}
}
