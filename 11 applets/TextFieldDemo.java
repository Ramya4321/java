import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="TextFieldDemo" width=800 height=700>
</applet>
*/
public class TextFieldDemo extends Applet implements ActionListener
{
	TextField t1,t2,t3,t4;
	public void init()
	{
		t1=new TextField();
		t2=new TextField("ramya");
		t3=new TextField(10);
		t4=new TextField("ramya sree",10);
		t1.setText("welcome to svec");
		add(t1);add(t2);add(t3);
		t1.select(11,15);
		t1.setEditable(true);
		t2.setEditable(false);
		t2.setEchoChar('*');//see . capital - E C
		t1.addActionListener(this);
		t2.addActionListener(this);
		t3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("selected text t1 is :"+t1.getSelectedText(),60,100);//svec
		g.drawString("selected text  t2 is :"+t2.getSelectedText(),60,120);//blank
		g.drawString("text is :"+t1.getText(),60,140);//welcome to svec
		g.drawString("editable :"+t1.isEditable(),60,160);//true
		g.drawString("echo char:" +t1.getEchoChar(),60,180);//blank
		g.drawString("echo char is set :" +t1.echoCharIsSet(),60,200);//false
	}
	
}