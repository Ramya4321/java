abstract class figure
{
	double res;
	abstract void area();
	void display()
	{
		System.out.println(res);
	}
}
class square extends figure
{
	double s;
	square(double x)
	{
			s=x;
	}
	void area()
	{
		res=s*s;
	}
}
class triangle extends figure
{
	double b,h;
	triangle(double x,double y)
	{
		b=x;
		h=y;
	}
	void area()
	{
		res = b*h;
	}
}
class rectangle extends figure
{
	double l,b;
	rectangle(double x,double y)
	{
		l=x;
		b=y;
	}
	void area()
	{
		res = l*b;
	}
}
class Abstractfigure
{
	public static void main(String args[])
	{
		square s = new square(5);
		rectangle r= new rectangle(10,20);
		triangle t = new triangle(2,3);
		s.area();
		s.display();
		r.area();
		t.area();
		r.display();
		t.display();
	}
}
/*25.0
200.0
6.0
*/