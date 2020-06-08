//stack continue
import java.lang.*;
import java.io.*;
import java.util.*;
class StaticqueueImp implements QueueInterface
{
	int front,rear, s[];
	StaticqueueImp (int size)
	{
		s=new int[size];
		front=-1;
		rear=-1; 
	}
	public void enqueue(int ele)
	{
		if(rear==s.length-1)
		{
			System.out.println("queue is overflowed");
			return;
		}
		if(front==-1 && rear ==-1)
			front++;
		
		rear++;
		s[rear]=ele;
		System.out.print(ele+" enqued");
		
	}
	public void dequeue()
	{
		if(front==rear+1)
			System.out.println("under flow");
		else
		{
			System.out.println(s[front]+" dequed");
			front++;
		}
	}
} 
class StaticQueue
{
	public static void main(String args[])
	{
		StaticqueueImp obj=new StaticqueueImp(5);
		int i,ele;
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n1.enqueue 2.dequeue 4.exit");
			System.out.print("enter your choice :");
			i=s.nextInt();
			switch(i)
			{
				case 1:
							System.out.print("enter element to be enqued :");
							ele=s.nextInt();
							obj.enqueue(ele);
							break;
				case 2:
							obj.dequeue();
							break;
			
				default:
					System.exit(0);
			}
		
		}
	}
}
/*

1.enqueue 2.dequeue 4.exit
enter your choice :1
enter element to be enqued :123
123 enqued
1.enqueue 2.dequeue 4.exit
enter your choice :2
123 dequed

1.enqueue 2.dequeue 4.exit
enter your choice :2
under flow

1.enqueue 2.dequeue 4.exit
enter your choice :1
enter element to be enqued :1534
1534 enqued
1.enqueue 2.dequeue 4.exit
enter your choice :1
enter element to be enqued :41534
41534 enqued
1.enqueue 2.dequeue 4.exit
enter your choice :1
enter element to be enqued :21
21 enqued
1.enqueue 2.dequeue 4.exit
enter your choice :1
enter element to be enqued :153
153 enqued
1.enqueue 2.dequeue 4.exit
enter your choice :1
enter element to be enqued :213
queue is overflowed

1.enqueue 2.dequeue 4.exit
enter your choice :2
1534 dequed

1.enqueue 2.dequeue 4.exit
enter your choice :2
41534 dequed

1.enqueue 2.dequeue 4.exit
enter your choice :2
21 dequed

1.enqueue 2.dequeue 4.exit
enter your choice :2
153 dequed

1.enqueue 2.dequeue 4.exit
enter your choice :2
under flow

1.enqueue 2.dequeue 4.exit
enter your choice :4


*/
