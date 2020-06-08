interface shape
{
	void triangle();
	void rectangle();
	void square();
}
abstract class c1 implements shape//no need  abstract
{
	double l,base, b,h,side;
	c1()
	{
		l=10;
		b=3;
		base=5;
		side=3;
		h=3;
	}
	public void triangle()
	{
		System.out.println(0.5*b*h);
	}
}
 class c2 extends c1
{
	public void rectangle()
	{
		System.out.println(l*b);
	}
	public void square()
	{
		System.out.println(side*side);
	}	
}
class InterfaceDemo
{
	public static void main(String[] args)
	{
		c2 obj = new c2();
		obj.rectangle();
		obj.square();
		obj.triangle();
	}
}
/*
30.0
9.0
4.5

*/