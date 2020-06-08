class ThrowExcep
{
	public static void main(String[] args)
	{
		int a=15;
		try
		{
			if(a<16 || a>40)
			throw new ArithmeticException();
		}
		catch(ArithmeticException obj)
		{
			System.out.println(obj);
		}
		int a1=5;
		try
		{
			if(a1<16 || a1>40)
			throw new ArithmeticException("throw");
		}
		catch(ArithmeticException obj)
		{
			System.out.println(obj);
		}
		int a2=5;
		try
		{
			if(a2<16 || a2>40)
			throw new ArithmeticException("throw");
		}
		catch(ArithmeticException obj)
		{
			System.out.println("nope");
		}
	}
}
/*
java.lang.ArithmeticException
java.lang.ArithmeticException: throw
nope
*/