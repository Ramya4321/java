class ThisDemo
{
	int a,b;
	ThisDemo(int x)
	{
		a=x;
		System.out.println("called 1 constructor");
	}
	ThisDemo(int x,int y)
	{
		this(x);
		b=y;
		System.out.println("called 2 constructor");
	}
}
class ThisCallingConstructor
{
	public static void main(String[] args)
	{
		ThisDemo obj = new ThisDemo(5,6);
	}
}