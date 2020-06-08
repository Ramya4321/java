import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="MouseDemo" width=700 height=500>
</applet>
*/
public class MouseDemo extends Applet implements MouseListener, MouseMotionListener
{
	int x,y;
	String msg=" ";
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseEntered(MouseEvent me)
	{
		x=me.getX();//<<<<------
		y=me.getY();
		showStatus("mouseEntered at" +x+ "and" +y);
		msg+="mouse entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		x=me.getX();//<<<<------
		y=me.getY();
		showStatus("mouseExited at" +x+ "and" +y);
		msg+="mouse exited";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		x=me.getX();//<<<<------
		y=me.getY();
		showStatus("mousePressed at" +x+ "and" +y);
		msg+="mouse pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		x=me.getX();//<<<<------
		y=me.getY();
		showStatus("mouse released at" +x+ "and" +y);
		msg+="mouse released";
		repaint();
	}
	public void mouseClicked(MouseEvent me)
	{
		x=me.getX();//<<<<------
		y=me.getY();
		showStatus("mouse clicked at" +x+ "and" +y);
		msg+="mouse clicked";
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();//<<<<------
		y=me.getY();
		showStatus("mouse moved at" +x+ "and" +y);
		msg+="mouse moved";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();//<<<<------
		y=me.getY();
		showStatus("mouseDragged at" +x+ "and" +y);
		msg+="mouse Dragged";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}