class c1
{
	int a,b;
	void init()
	{
		a=5;
		b=6;
	}
}//no sami colon
class c2 extends c1
{
	void add()
	{
		int result = a+b;
		System.out.println(result);
	}
 
}
class Inherit
{
	public static void main(String args[])
	{
		c2 obj = new c2();
		obj.init();
		obj.add();
	}
}
//11