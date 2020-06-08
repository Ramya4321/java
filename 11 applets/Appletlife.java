import java.applet.*;
import java.awt.*;
/*
<applet code="Appletlife" width=700 height=200>
</applet>
*/
public class Appletlife extends Applet
{
	String msg;
	public void init()
	{
		msg="Init";
	}
	public void start()
	{
		msg+=" Start";
	}
	public void paint(Graphics g)
	{
		msg+=" paint";
		g.drawString(msg,100,50);
	}
	public void stop()
	{
		msg+="   Stop";//if no + then init will not be shown in the window
	}
	public void destroy()
	{
		msg+="Destroyed";
		System.out.println(msg);
	}
}
/*
C:\Users\Rayapati Nikhil\Desktop\Ramya\B tech\2-1 java ds os\java\11 applets>appletviewer Appletlife.java
Init Start paint   Stop Start paint   StopDestroyed

C:\Users\Rayapati Nikhil\Desktop\Ramya\B tech\2-1 java ds os\java\11 applets>
*/