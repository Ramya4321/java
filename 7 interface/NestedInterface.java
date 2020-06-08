interface i1
{
	interface i2
	{
		void display();
	}
	void display1();
}
class c1 implements i1.i2
{
	public void display1()
	{
		System.out.println("csse");
	}
	public void display()
	{
		System.out.println("it");
	}
}
class NestedInterface
{
	public static void main(String[] args)
	{
		c1 obj = new c1();
		obj.display();
		obj.display1();
	}
}
//it
//csse