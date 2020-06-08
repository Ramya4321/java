import java.lang.*;
import java.io.*;
import java.util.*;
class StaticstackImp implements StackInterface
{
	int top, s[];
	StaticstackImp (int size)
	{
		s=new int[size];
		top=-1;
	}
	public void push(int ele)
	{
		if(top==s.length-1)
			System.out.println("stack is overflowed");
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
class StaticStack
{
	public static void main(String args[])
	{
		StaticstackImp obj=new StaticstackImp(5);
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
enter element to be pushed :145
145 pushed
1.push 2.pop 3.top 4.exit
enter your choice :1
enter element to be pushed :143
143 pushed
1.push 2.pop 3.top 4.exit
enter your choice :1
enter element to be pushed :235
235 pushed
1.push 2.pop 3.top 4.exit
enter your choice :1
enter element to be pushed :2354
2354 pushed
1.push 2.pop 3.top 4.exit
enter your choice :1
enter element to be pushed :5453
stack is overflowed

1.push 2.pop 3.top 4.exit
enter your choice :2
2354 popped

1.push 2.pop 3.top 4.exit
enter your choice :2
235 popped

1.push 2.pop 3.top 4.exit
enter your choice :3
top element is 143

1.push 2.pop 3.top 4.exit
enter your choice :2
143 popped

1.push 2.pop 3.top 4.exit
enter your choice :2
145 popped

1.push 2.pop 3.top 4.exit
enter your choice :3
top element is 12

1.push 2.pop 3.top 4.exit
enter your choice :3
top element is 12

1.push 2.pop 3.top 4.exit
enter your choice :2
12 popped

1.push 2.pop 3.top 4.exit
enter your choice :2
under flow

1.push 2.pop 3.top 4.exit
enter your choice :2
under flow

1.push 2.pop 3.top 4.exit
enter your choice :4

*/
