/*4. a. Create a class Amount In Words to convert the
amount into words. (Consider the amount to be not
more than 100000.)*/
import java.util.*;
import java.io.*;
import java.lang.*;
class AmountInWords___
{
	void convert(int n,String s)
	{
		String units[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fiveteen","sixteen","seventeen","eighteen","nineteen"};
		String tens[]={"","","twenty","thirty","fourty","fivrty","sixty","seventy","eighty","ninety"};
		if(n>19)
			System.out.print(tens[n/10]+" "+units[n%10]);
		else
			System.out.print(units[n]);
		System.out.print(" "+s+" ");
		
	}
}
class Week4a
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		AmountInWords obj=new AmountInWords();
		System.out.print("enter amount  ");
		n=sc.nextInt();
		if(n==100000)
			System.out.print("one lakh");
		else if(n>100000)
			System.out.print("give a number less than one lakh");
		else
		{
			if(n>1000)
			{
			obj.convert((n/1000),"thousands");
				if((n%1000)!=0)
					obj.convert((n/100)%10,"hundreds");
			obj.convert((n%100),"rupees only");
			}
			else if(n>100)
			{
			obj.convert((n/100)%10,"hundreds");
				if((n%100)!=0)
					obj.convert((n%100),"rupees only");
			}
			else
			obj.convert((n%100),"rupees only");
		}
	}
}
/*
enter amount  10000
ten thousands  rupees only
Y:\javaprogramme>java Week4a
enter amount  100000
one lakh
Y:\javaprogramme>java Week4a
enter amount  5000
five thousands  rupees only
Y:\javaprogramme>java Week4a
enter amount  1111
one thousands one hundreds eleven rupees only
Y:\javaprogramme>java Week4a
enter amount  12
twelve rupees only
Y:\javaprogramme>java Week4a
enter amount  1
one rupees only
Y:\javaprogramme>java Week4a
enter amount  4500
four thousands five hundreds  rupees only
*/