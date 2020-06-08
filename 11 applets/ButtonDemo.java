import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ButtonDemo" width=700 height=500>
</applet>
*/
public class ButtonDemo extends Applet implements ActionListener
{
	String str;
	Button b1,b2;
	public void init()
	{
		b1=new Button();
		b2=new Button("svec");
		b1.setLabel("submit");
		add(b1);
		add(b2);
		System.out.println(b2.getLabel());
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		str=ae.getActionCommand();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("you have clicked "+str,20,100);
	}
	
}
/*
in cmd

C:\Users\Rayapati Nikhil\Desktop\c files\B tech\2-1 OS JAVA DS\java>Appletviewer ButtonDemo.java
svec

*/
