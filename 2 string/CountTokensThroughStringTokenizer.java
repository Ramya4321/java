/*
4.b. Write a Program to count tokens- number of words
 and characters in a string
*/
import java.util.*;
import java.io.*;
import java.lang.*;
class CountTokensThroughStringTokenizer
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("enter string ");
		s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s);
		System.out.println("number of words="+st.countTokens());
		System.out.println("number of letters="+s.length());
	}
}
/*
output:
Y:\javaprogramme>javac Week4b.java
Y:\javaprogramme>java Week4b
enter string
welcome to A new world
number of words=5
number of letters=22
*/