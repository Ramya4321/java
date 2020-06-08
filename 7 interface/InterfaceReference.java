interface i1
{
	void display();
}
class c1 implements i1
{
	public void display()
	{
		System.out.println("csse");
	}
	void display1()
	{
		System.out.println("it");
	}
}
class InterfaceReference
{
	public static void main(String[] args)
	{
		c1 obj1 = new c1();
		i1 obj;
		obj= obj1;
		obj.display();//csse
		//obj.display1();//we cannot call this
	}
}