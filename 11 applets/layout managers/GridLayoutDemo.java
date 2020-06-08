import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="GridLayoutdemo" width=700 height=500>
</applet>
*/
public class GridLayoutdemo extends Applet//no main
{
	Button b1,b2,b3,b4,b5;
	public void init()
	{
		//GridLayout g=new GridLayout();
		//GridLayout g=new GridLayout(5,6);
		GridLayout g=new GridLayout(5,6,80,80);
		setLayout(g);
		b1=new Button("cse");
		b2=new Button("csse");
		b3=new Button("ece");
		b4=new Button("eee");
		b5=new Button("eie");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
	}
}