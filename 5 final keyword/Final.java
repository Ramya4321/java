class c1
{
	final int x=10;
	void display()
	{
		//x++;
		System.out.println(x);
	}
}
class Final
{
	public static void main(String args[])
	{
		/*
		final int x;
		int y;
			//System.out.println(x);
			//System.out.println(y);
		const int z;
		System.out.println(z);
		*/
		c1 obj = new c1();
		obj.display();
	}
}
//10