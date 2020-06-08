/*Aim:
7. Develop an Applet that receives an integer in one text
field, and computes its factorial value and returns it in
another text field, when the button named “Compute”
is clicked.
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ComputeFactorial" width=700 height=500>
</applet>
*/
public class ComputeFactorial extends Applet implements ActionListener
{
	Button b;
	Label l1,l2;
	TextField t1,t2;
	public void init()
	{
		l1=new Label("enter number");
		l2=new Label("factorial");
		t1=new TextField(10);
		t2=new TextField(10);
		b=new Button("compute");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		b.addActionListener(this);//to register when an event is performed
	}
	public void actionPerformed(ActionEvent ae)//to handle event performed by button click
	{
		int n,i,fact=1;
		n=Integer.parseInt(t1.getText());
		for(i=1;i<=n;i++)
			fact=fact*i;
		t2.setText(""+fact);//getText gets a string so we 
		//add space string to an integer so it becomes a string
	}
}