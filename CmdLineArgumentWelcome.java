/*
1b.b. Write a Program to accept a String as a Command
line argument and the program should print a
Welcome message.
*/
import java.lang.*;
import java.io.*;
class CmdLineArgumentWelcome
{
	public static void main(String args[])
	{
	System.out.println("welcome\t"+args[0]);
	}
}
/*
output:............
javac Week1b.java
java Week1b ramya
welcome   ramya
*/