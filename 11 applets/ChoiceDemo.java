import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code ="ChoiceDemo" width=2000 height=600>
</applet>
*/
public class ChoiceDemo extends Applet implements ItemListener//
{
	Choice c;
	public void init()
	{
		//only one constructor
		c=new Choice();
		add(c);
		c.add("ap0");
		c.add("ap1");
		c.add("ap2");
		c.add("ap3");
		c.add("ap4");
		c.add("ap5");
		c.select(5);
		c.select("ap0");
		c.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();	
	}
	public void paint(Graphics g)
	{
		g.drawString("you have selected : "+c.getSelectedItem(),60,40);
		g.drawString("index :"+c.getSelectedIndex(),60,60);
		g.drawString("element is :"+c.getItem(3),60,80);//ap3
		g.drawString("total items :"+c.getItemCount(),60,100);//6
	}
}