class c1
{
	int i;
}
class c2 extends c1
{
	int i;
	c2()
	{
		i=20;
		super.i=30;
	}
	void display()
	{
		System.out.println(i);
		System.out.println(super.i);
	}
}
class Supervariable
{
	public static void main(String args[])
	{
		c2 obj = new c2();
		obj.display();
	}
}
//20
//30