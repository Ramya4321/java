class Exception
{
	public static void main(String[] args)
	{
		int x=15,res;
		int d=0;
		//try
		{
			res = x/d;
			System.out.println(res);
		}
	//	catch(ArithmeticException obj)
		{
			System.out.println("this overrides by the original");
		}
	}
}
//got arithmetic exception at run time