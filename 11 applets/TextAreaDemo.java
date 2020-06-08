import java.applet.*;
import java.awt.*;
/*
<applet code="TextAreaDemo" width=400 height=400>
</applet>
*/
public class TextAreaDemo extends Applet
{
	TextArea t1,t2,t3,t4,t5;
	public void init()
	{
		t1=new TextArea();
		t2=new TextArea("welcome to svec");
		t3=new TextArea(5,6);//blank
		t4=new TextArea("csse",5,6);//csse
		t5=new TextArea("svec",5,6,2);//svec
		add(t1);add(t2);add(t3);
		add(t5);add(t4);
		t1.append("holy");//holy
		t2.insert("aa",1);//familyaelcome to svec
		t2.replaceRange("family",0,2);
	}
}