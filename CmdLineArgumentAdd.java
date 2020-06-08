/*
1. a. Write a Program to accept two integers through the
command line arguments and print the sum of the
two numbers.
*/
import java.lang.*;
import java.io.*;
class CmdLineArgumentAdd
{
	public static void main(String args[])
	{
		
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println("addition of two numbers="+(a+b));
		
		/*System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println("addition of two numbers="+(args[0]+args[1]));
		5
		6
		addition of two numbers=56
		*/
	}
}
/*
output:............
javac Week1a.java
java Week1a 5 6
adittion of two numbers=11
*/
