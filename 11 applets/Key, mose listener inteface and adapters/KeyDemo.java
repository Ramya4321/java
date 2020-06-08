import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="KeyDemo" width=700 height=500>
</applet>
*/
public class KeyDemo extends Applet implements KeyListener
{
	String msg=" ";
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent me)
	{
		showStatus("key Pressed");
		//repaint();
	}
	public void keyReleased(KeyEvent me)
	{
		showStatus("key Released");
		//repaint();
	}
	public void keyTyped(KeyEvent ke)
	{
		showStatus("key Typed");
		//repaint();
		msg+=ke.getKeyChar();/////<<<<<-------
		repaint();
	}	
	public void paint(Graphics g)
	{
		g.drawString(msg,60,70);
	}
}
	
	