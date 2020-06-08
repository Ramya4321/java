import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="CardLayoutDemo" width=700 height=500>
</applet>
*/
public class CardLayoutDemo extends Applet implements ActionListener//<--------public
{
	Button b1,b2,b3,b4,b5;
	CardLayout c;
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8;
	Panel p,p1,p2,p3,p4;
	public void init()
	{
		c=new CardLayout(12,12);
		//c=new CardLayout();
		p=new Panel();
		p.setLayout(c);//<<-----
		c1=new Checkbox("cse");
		c2=new Checkbox("csse");
		c3=new Checkbox("it");
		c4=new Checkbox("ece");
		c5=new Checkbox("eee");
		c6=new Checkbox("eie");
		c7=new Checkbox("civil");
		c8=new Checkbox("mech");
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		p4=new Panel();
		p1.add(c1);
		p1.add(c2);
		p2.add(c3);
		p2.add(c4);
		p3.add(c5);
		p3.add(c6);
		p4.add(c7);
		p4.add(c8);
		p.add(p1,"panel 1");
		p.add(p2,"panel 2");//////<<<<--
		p.add(p3,"panel 3");
		p.add(p4,"panel 4");
		b1=new Button("first");	
		b2=new Button("last");	
		b3=new Button("next");	
		b4=new Button("previous");	
		b5=new Button("panel 2");	
		add(p);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)//<<----small a and A
	{
		if(ae.getActionCommand()=="first")//<<<--
			c.first(p);
		if(ae.getActionCommand()=="last")
			c.last(p);
		if(ae.getActionCommand()=="next")
			c.next(p);
		if(ae.getActionCommand()=="previous")
			c.previous(p);
		if(ae.getActionCommand()=="panel 2")
			c.show(p,"panel 2");//<<<<----
	}
}