import java.util.*;
import java.lang.*;
class AgeException extends RuntimeException//using Exception showing error//compiler problem 
{
	AgeException()
	{
		super();
	}
	AgeException(String s)
	{
		super(s);
	}
	public String toString()
	{
		return "you have entered wrong message";
	}
}
class Creatingown 
{
	public static void main(String[] args)
	{
			int age;
			Scanner s = new Scanner(System.in);
			try
			{
				age=s.nextInt();
				if(age<17 || age >40)
				{
					throw new AgeException("invalid");
				}
				System.out.println("age="+age);
			}
			catch(AgeException e)
			{
				System.out.println(e);
				System.out.println(e.getMessage());
			}
			
	}
}