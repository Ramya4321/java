
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="CheckboxGroupDemo" width=700 height=500>
</applet>
*/
public class CheckboxGroupDemo extends Applet implements ItemListener
{
	CheckboxGroup cg;
	Checkbox c1,c2,c3,c4;
	String msg=" ";
	public void init()
	{
		cg=new CheckboxGroup();
		c1=new Checkbox("cse",cg,false);
		c2=new Checkbox("csse",cg,false);
		c3=new Checkbox("it",true,cg);//selects c3
		c4=new Checkbox("ece",cg,true);//only one can be true..so c3 replaced by c4
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		cg.setSelectedCheckbox(c3);//c4 replaced by c3
		cg.setSelectedCheckbox(c2);//c3 replaced by c2
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("you have selected : "+cg.getSelectedCheckbox().getLabel(),40,100);
		//g.drawString("you have selected : "+cg.getSelectedCheckbox(),40,100);//java awt Checkbox[checkbox0,312,5,46x23,label=csse,state=true]
		//or
		//msg+="you have selected:  ";
		//msg+=cg.getSelectedCheckbox().getLabel();
		//g.drawString(msg,60,100);
	}      
}
	