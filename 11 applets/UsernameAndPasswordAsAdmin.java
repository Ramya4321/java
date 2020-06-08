import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="UsernameAndPasswordAsAdmin " width=700 height=500>
</applet>
*/
public class UsernameAndPasswordAsAdmin extends Applet implements ActionListener
{
	String user,password;
	Button b;
	Label l1,l2;
	TextField t1,t2;
	public void init()
	{
		l1=new Label("enter user number");
		l2=new Label("password");
		t1=new TextField(10);
		t2=new TextField(10);
		b=new Button("submit");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		b.addActionListener(this);//to register when an event is performed
	}
	public void actionPerformed(ActionEvent ae)//to handle event performed by button click
	{
		
		user=(t1.getText());
		password=(t1.getText());
		repaint();
		
	}
	public void paint(Graphics g)
	{
		int flag=0;
			if(user=="admin" && password=="admin")
				flag=1;
				
			else
				flag=2;
			
			if(flag==1)
				g.drawString("authorized user",100,100);
			else if(flag==2)
					g.drawString("not authorized user",100,100);
	}
}
/*Aim:
7b.input only take admin as username and password
*/