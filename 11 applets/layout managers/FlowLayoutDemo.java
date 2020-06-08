import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="FlowLayoutDemo" width=700 height=500>
</applet>
*/
public class FlowLayoutDemo extends Applet
{
	Checkbox c1,c2,c3;//box small
	public void init()
	{
		FlowLayout f=new FlowLayout(FlowLayout.CENTER,180,180);//pixels of space
		//FlowLayout.RIGHT .LEFT .LEADING .TRIDING
		//FlowLayout f=new FlowLayout();
		//FlowLayout f=new FlowLayout(FlowLayout.CENTER);
		//FlowLayout f=new FlowLayout(180,180,FlowLayout.CENTER);
		setLayout(f);
		setBackground(Color.YELLOW);
		c1=new Checkbox("cse");
		c2=new Checkbox("ece");
		c3=new Checkbox("eee");
		add(c1);
		add(c2);
		add(c3);
	}
}