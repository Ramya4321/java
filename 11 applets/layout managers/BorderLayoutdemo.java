import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="BorderLayoutdemo" width=700 height=500>
</applet>
*/
public class BorderLayoutdemo extends Applet//no main
{
	Button b1,b2,b3,b4,b5;
	public void init()
	{
		BorderLayout b=new BorderLayout(12,14);
		BorderLayout b=new BorderLayout();		
		setLayout(b);
		b1=new Button("svec");
		b2=new Button("ece");
		b3=new Button("cse");
		b4=new Button("it");
		b5=new Button("csse");
		add(b5,BorderLayout.CENTER);
		add(b1,BorderLayout.WEST);
		add(b2,BorderLayout.EAST);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.NORTH);
	}
	
}