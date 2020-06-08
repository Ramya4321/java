/*3. a. Write a program to print the element of an array that
has occurred highest number of time.*/
import java.lang.*;
import java.io.*;
import java.util.*;
class PrintEleOcuurHigh
{
	public static void main(String args[])
	{
		int i,n,element,current,highest;
		Scanner s=new Scanner(System.in);
		System.out.print("enter number of elements \t");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements ");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		Arrays.sort(a);
		element=a[0];
		highest=1;
		current=1;
		for(i=1;i<n;i++)
		{
			if(a[i]==a[i-1])
				current++;
			else
			{
				if(current>highest)
				{
				
					highest=current;
					element=a[i-1];
				}
				current=1;		
			}
		}
		if(current>highest)
		{
			element=a[i-1];
		}
		System.out.println("most repeated element is "+element);
	}
}
/*
output:
enter number of elements 10
enter elements
1 2 1 5 3 3 1 6 4 4
most repeated element is 1

Y:\javaprogramme>javac Week3a.java

Y:\javaprogramme>java Week3a
enter number of elements        5
enter elements
12 12 3 1 5
most repeated element is 12
*/