import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ListDemo" width=800 height=700>
</applet>
*/
public class ListDemo extends Applet implements ActionListener
{
	List l1,l2,l3;
	String[] s;
	int[] ind;
	String msg,m1;
	public void init()
	{
		l1=new List();//occurred default size
		l2=new List(5);//rows
		l3=new List(6,true);//rows, select multiple items
		add(l1);
		add(l2);
		add(l3);
		l1.add("svec");
		l1.add("csse");
		l2.add("a");
		l2.add("b",0);//string index
		l2.add("c");
		l3.add("0");
		l3.add("1");
		l3.add("2");
		l3.add("3");
		l3.add("4");
		l3.add("5");
		l1.select(0);//-----<<>>small s
		l1.select(2);//nothing
		l1.select(1);//replaced form 0..only 1 selected
		l2.select(4);//nothing
		l3.select(0);
		l3.select(4);
		l1.addActionListener(this);
		l2.addActionListener(this);
		l3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		/*s=l3.getSelectedItems();
		ind=l3.getSelectedIndexes();

		msg=" ";
		m1=" ";
		for(int i=0;i<s.length;i++)//s is string ....length not a function
		{
			msg+=s[i]+" ";
			m1+=ind[i]+" ";
		}*/
		repaint();
	}
	public void paint(Graphics g)
	{
		
		s=l3.getSelectedItems();
		ind=l3.getSelectedIndexes();

		msg=" ";
		m1=" ";
		for(int i=0;i<s.length;i++)//s is string ....length not a function
		{
			msg+=s[i]+" ";
			m1+=ind[i]+" ";
		}
		g.drawString("selected items :"+l3.getSelectedItems(),60,100);//code
		g.drawString("slected index :"+l3.getSelectedIndexes(),60,120);//code
		g.drawString("slected index :"+s,60,220);//code
		g.drawString("slected index :"+ind,60,240);//code
		g.drawString("item at index 5 :"+l3.getItem(5),60,140);//5
		g.drawString("item count :"+l1.getItemCount(),60,160);//2
		g.drawString("multiple items :"+msg,60,180);//0 4
		g.drawString("indexes :"+m1,60,200);//0 4
		
		
		//if changes made in list 
	}
}
	
	