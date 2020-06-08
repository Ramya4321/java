import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code ="CheckboxDemo" width=400 height=400>
</applet>
*/
public class CheckboxDemo extends Applet implements ItemListener//
{
	Checkbox c1,c2,c3;
	public void init()
	{
		c1=new Checkbox();
		c2=new Checkbox("hola");
		c3=new Checkbox("robo",true);
		add(c1);
		c1.setLabel("ramya");
		add(c2);
		add(c3);
		c2.setState(false);
		System.out.println(c1.getState());//false//later changes in cmd will not be reflected
		System.out.println(c2.getLabel());//hola
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ae)//itemStates
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(c1.getLabel()+":"+c1.getState(),20,40);
		g.drawString(c2.getLabel()+":"+c2.getState(),20,60);//drawString
		g.drawString(c3.getLabel()+":"+c3.getState(),20,80);
	}
}
		