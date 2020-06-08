class c1
{
	void show()
	{
		System.out.println("1");
	}
}
class c2 extends c1
{
	void show()
	{
		System.out.println("2");
	}
	void display()
	{
		show();
		super.show();
	}
}
class OverridingWithSuper
{
	public static void main(String args[])
	{
		c2 obj = new c2();
		obj.display();
		obj.show();
	}
}
//2
//1
//2