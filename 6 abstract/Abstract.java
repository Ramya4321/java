abstract class demo
{//shoukd be abstract as it has an abstract method
	abstract void display();
}
abstract class demo1 extends demo
//without abstract it wont work as it is extending an abstract method class
{
	void display1()//no need abstract as it has definition
	{
		System.out.println("hello");
	}
}
class demo2 extends demo1
{
	void display()
	{
		System.out.println("welcome");
	}
}
class Abstract 
{
	public static void main(String args[])
	{
		demo2 obj = new demo2();
		obj.display();
		obj.display1();
	}
}