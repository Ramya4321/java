//stack continue
import java.lang.*;
import java.io.*;
import java.util.*;
class DynamicqueueImp implements QueueInterface
{
	int front,rear, q[];
	DynamicqueueImp (int size)
	{
		q=new int[size];
		front=-1;
		rear=-1; 
	}
	public void enqueue(int ele)
	{
		if(rear==q.length-1)
		{
			int n=q.length*2;
			int temp[]=new int[n];
			for(int i=0;i<q.length;i++)
				temp[i]=q[i];
			q=temp;
		}
		if(front==-1 && rear ==-1)
			front++;
		
		rear++;
		q[rear]=ele;
		System.out.print(ele+" enqued");
		
	}
	public void dequeue()
	{
		if(front==rear+1)
			System.out.println("under flow");
		else
		{
			System.out.println(q[front]+" dequed");
			front++;
		}
	}
} 
class DynamicQueue
{
	public static void main(String args[])
	{
		DynamicqueueImp obj=new DynamicqueueImp(5);
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

Y:\javaprogramme>java Dynamicqueue

1.enqueue 2.dequeue 4.exit
enter your choice :1
enter element to be enqued :23
23 enqued
1.enqueue 2.dequeue 4.exit
enter your choice :1
enter element to be enqued :52
52 enqued
1.enqueue 2.dequeue 4.exit
enter your choice :1
enter element to be enqued :63
63 enqued
1.enqueue 2.dequeue 4.exit
enter your choice :2
23 dequed

1.enqueue 2.dequeue 4.exit
enter your choice :2
52 dequed

1.enqueue 2.dequeue 4.exit
enter your choice :2
63 dequed

1.enqueue 2.dequeue 4.exit
enter your choice :2
under flow

1.enqueue 2.dequeue 4.exit
enter your choice :1
enter element to be enqued :3
3 enqued
1.enqueue 2.dequeue 4.exit
enter your choice :4

Y:\javaprogramme>






*/
