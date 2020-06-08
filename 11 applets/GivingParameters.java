import java.applet.*;
import java.awt.*;
/*
<applet code="GivingParameters" width=700 height=200>
<param name=sname value=Ramu>
<param name=age value=18>
<param name=avg value=7.4>

</applet>
*/
public class GivingParameters extends Applet////////||p small in <param>
{
	public void paint(Graphics g)
	{
		String stname;
		int a;
		float x;
		stname=getParameter("sname");
		a=Integer.parseInt(getParameter("age"));
		x=Float.parseFloat(getParameter("avg"));
		g.drawString("name="+stname,20,20);
		g.drawString("age="+a,20,40);
		g.drawString("avg="+x,20,60);
		
	}
}