import java.lang.*;
import java.io.*;
import java.util.*;
class ArrayDeclareTypes
{
	public static void main(String[] args)
{
	int a[] = {1,2,3,4};
	int b[] = new int{1,2,3,4};
	for(int i=0;i<5;i++)
	System.out.println("name="+a[i]);
	for(int i=0;i<5;i++)
	System.out.println("name="+b[i]);
}
}