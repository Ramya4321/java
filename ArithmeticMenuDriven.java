/*
2.Write a program that displays a menu with options 1.
Add 2. Sub. Based on the options chosen, read 2
numbers and perform the relevant operation. After
performing the operation, the program should ask the
user if he wants to continue. If the user presses y or Y,
then the program should continue displaying the menu
else the program should terminate.[Use Scanner class]
*/
import java.lang.*;
import java.io.*;
import java.util.*;
class ArithmeticMenuDriven
{
	public static void main(String args[])
	{
		int a,b,ch,result=0;
		char c;
		Scanner obj=new Scanner(System.in);
		do
		{
		System.out.println("enter a value:");
		a=obj.nextInt();
		System.out.println("enter b value:");
		b=obj.nextInt();
		System.out.println("1.add 2.subtract\n enter your choice");
		ch=obj.nextInt();
		switch(ch)
		{
			case 1:result=a+b;
					break;
			case 2:result=a-b;
					break;
			default:System.out.println("enter right choice\n");
		}
		System.out.println("the result is:"+(result));
		System.out.println("do you want ot enter again:(press y or Y)");
		c=obj.next().charAt(0);
	    }while(c=='y' || c=='Y');
	}
}
/*
output:...........
enter a value:
5
enter b value:
6
1.add 2.subtract
enter your choice
1
the result is:11
do you want ot enter again:(press y or Y) 
y
enter a value:
6
enter b value:
11
1.add 2.subtract
enter your choice
-5
the result is:11
do you want to enter again:(press y or Y) 
h
*/