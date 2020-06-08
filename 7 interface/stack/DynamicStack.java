import java.lang.*;
import java.io.*;
import java.util.*;
class DynamicstackImp implements StackInterface
{
	int top, s[];
	DynamicstackImp (int size)
	{
		s=new int[size];
		top=-1;
	}
	public void push(int ele)
	{
		int i;
		if(top==s.length-1)
		{
			int n=s.length*2;
			int temp[]=new int[n];
			for(i=0;i<s.length;i++)
				temp[i]=s[i];
			s=temp;
		}
		else 
		{
			top++;
			s[top]=ele;
			System.out.print(ele+" pushed");
		}
	}
	public void pop()
	{
		if(top==-1)
			System.out.println("under flow");
		else
		{
			System.out.println(s[top]+" popped");
			top--;
		}
	}
	void top()
	{
		System.out.println("top element is "+s[top]);
	}
	
} 
class DynamicStack
{
	public static void main(String args[])
	{
		DynamicstackImp obj=new DynamicstackImp(5);
		int i,ele;
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n1.push 2.pop 3.top 4.exit");
			System.out.print("enter your choice :");
			i=s.nextInt();
			switch(i)
			{
				case 1:
							System.out.print("enter element to be pushed :");
							ele=s.nextInt();
							obj.push(ele);
							break;
				case 2:
							obj.pop();
							break;
				case 3:
							obj.top();
							break;
				default:
					System.exit(0);
			}
		
		}
	}
}
/*

1.push 2.pop 3.top 4.exit
enter your choice :1
enter element to be pushed :12
12 pushed
1.push 2.pop 3.top 4.exit
enter your choice :1
enter element to be pushed :13
13 pushed
1.push 2.pop 3.top 4.exit
enter your choice :1
enter element to be pushed :14
14 pushed
1.push 2.pop 3.top 4.exit
enter your choice :1
enter element to be pushed :16
16 pushed
1.push 2.pop 3.top 4.exit
enter your choice :1
enter element to be pushed :17
17 pushed
1.push 2.pop 3.top 4.exit
enter your choice :1
enter element to be pushed :18

1.push 2.pop 3.top 4.exit
enter your choice :1
enter element to be pushed :19
19 pushed
1.push 2.pop 3.top 4.exit
enter your choice :1
enter element to be pushed :20
20 pushed
1.push 2.pop 3.top 4.exit
enter your choice :2
20 popped

1.push 2.pop 3.top 4.exit
enter your choice :2
19 popped

1.push 2.pop 3.top 4.exit
enter your choice :3
top element is 17

1.push 2.pop 3.top 4.exit
enter your choice :2
17 popped

1.push 2.pop 3.top 4.exit
enter your choice :3
top element is 16

1.push 2.pop 3.top 4.exit
enter your choice :2
16 popped

1.push 2.pop 3.top 4.exit
enter your choice :2
14 popped

1.push 2.pop 3.top 4.exit
enter your choice :2
13 popped

1.push 2.pop 3.top 4.exit
enter your choice :2
12 popped

1.push 2.pop 3.top 4.exit
enter your choice :2
under flow

1.push 2.pop 3.top 4.exit
enter your choice :4

Y:\javaprogramme>

*/
