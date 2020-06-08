
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="CalculatorInDifferentFormat" width=700 height=500>
</applet>
*/
public class CalculatorInDifferentFormat extends Applet implements ActionListener
{
	
	Button b[]=new Button[10];
	Button add,sub,mul,div,mod,equal,clear;
	TextField t1;
	String str;
	char c,op;
	int m,n,res;
	public void init()
	{
		GridLayout g= new GridLayout(5,4);
		setLayout(g);
		t1=new TextField(10);
		for(int i=0;i<10;i++)
			b[i]=new Button(""+i);
		//button takes a stirng so we are
		//adding space to i to make a string
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		mod=new Button("%");
		div=new Button("/");
		equal=new Button("=");
		clear=new Button("clear");
		add(t1);
		for(int i=0;i<10;i++)
			add(b[i]);
		add(add);
		add(sub);
		add(mul);
		add(mod);
		add(div);
		add(equal);
		add(clear);
		for(int i=0;i<10;i++)
			b[i].addActionListener(this);
		add.addActionListener(this);
		mul.addActionListener(this);
		mod.addActionListener(this);
		div.addActionListener(this);
		sub.addActionListener(this);
		equal.addActionListener(this);
		clear.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		str=ae.getActionCommand();
		//action listener takes a string
		c=str.charAt(0);
		//converting string into charecter
		if(Character.isDigit(c))
			t1.setText(t1.getText()+str);
			//setText takes a string
		if(str.equals("+"))
		{
			m=Integer.parseInt(t1.getText());
			op='+';
			t1.setText("");
		}
		else if(str.equals("-"))
		{
			m=Integer.parseInt(t1.getText());
			op='-';
			t1.setText("");
		}
		else if(str.equals("*"))
		{
			m=Integer.parseInt(t1.getText());
			op='*';
			t1.setText("");
		}
		else if(str.equals("/"))
		{
			m=Integer.parseInt(t1.getText());
			op='/';
			t1.setText("");
		}
		else if(str.equals("%"))
		{
			m=Integer.parseInt(t1.getText());
			op='%';
			t1.setText("");
		}
		else if(str.equals("="))
		{
			n=Integer.parseInt(t1.getText());
			//taking last entered text to n 
			if(op=='+')
				res=m+n;
			else if(op=='-')
				res=m-n;
			else if(op=='/')
				res=m/n;
			else if(op=='*')
				res=m*n;
			else if(op=='%')
				res=m%n;
			t1.setText(""+res);
		}
		else if(str.equals("clear"))
			t1.setText("");
	}
}