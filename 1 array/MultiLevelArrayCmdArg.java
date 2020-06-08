/*
3b. Write a program to find greatest number in a 3*3
array. The program is supposed to receive 9 integer
numbers as command line arguments.
*/
import java.lang.*;
import java.io.*;
import java.util.*;
class MultiLevelArrayCmdArg
{
	public static void main(String args[])
	{
		int i,j,k=0,max;
		int a[][]=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=Integer.parseInt(args[k]);
				k++;
			}
		}
		max=a[0][0];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(max<a[i][j])
					max=a[i][j];
			}
		}
		System.out.println("maximum element is "+max);
	}
}
/*

Y:\javaprogramme>java Week3b 1 2 3 5 6 4 8 7 10
maximum element is 10

*/