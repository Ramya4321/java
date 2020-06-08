import java.applet.*;
import java.awt.*;
/*
<applet code ="LabelDemo" width=400 height=400>
</applet>
*/
public class LabelDemo extends Applet
{
	public void init()
	{
		setBackground(Color.YELLOW);//C
		Label l1=new Label();
		Label l2=new Label("ramya");//DEFAULT alignment cemter
		Label l3=new Label("king",Label.RIGHT);
		add(l1);add(l2);add(l3);
		l1.setText("svec");
		System.out.println(l3.getAlignment());
		l1.setAlignment(Label.LEFT);
		System.out.println(l2.getText());
	}	
}