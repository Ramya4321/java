class c1
{
	int a,b;
	c1()
	{
		a=10;
		b=20;
	}
	c1(int x, int y)
	{
		a=x;
		b=y;
	}
}
class c2 extends c1
{
	int c;
	c2()
	{
		super();
		c=30;
	}
	c2(int x, int y, int z)
	{
		super(x,y);
		c=z;
	}
	void display()
	{
		System.out.println(a+" "+b+ " "+c);
	}
}
class SuperConstructor
{
	public static void main(String args[])
	{
		c2 obj = new c2();
		c2 obj1 = new c2(10,20,30);
		obj.display();
		obj1.display();
	}
}
//10 20 30
//10 20 30