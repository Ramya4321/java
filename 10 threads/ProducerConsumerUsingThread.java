/*
Aim:
6. A. Write a program that correctly implements producer
consumer problem using the concept of inter-thread
communication.
*/
class company
{
	int n;
	boolean item=false;
	synchronized void produce(int x)
	{
		if(item)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("producer caught");
			}
		}
		item=true;
		n=x;
		System.out.println(x+" produced");
		notify();
	}	
	synchronized void consume()
	{
		if(!item)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("producer caught");
			}
		}
		item=false;
		System.out.println(n+" consumed");
		notify();
	}	
}
class producer extends Thread
{
	int i;
	company ob;
	producer(company obj)
	{
		ob=obj;
	}
	public void run()
	{
		i=0;
		while(true)
		{
			i++;
			try
			{
				ob.produce(i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("producer caught");
			}
		}
	}
}
class consumer extends Thread
{
	int i;
	company ob;
	consumer(company obj)
	{
		ob=obj;
	}
	public void run()
	{
		while(true)
		{
			try
			{
				ob.consume();
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println("producer caught");
			}
		}
	}
}
class ProducerConsumerUsingThread
{
	public static void main(String args[])
	{
		company c=new company();
		producer pro=new producer(c);
		consumer con=new consumer(c);
		System.out.println("press ctrl+c to  stop");
		pro.start();
		con.start();
	}
}
/*
output:

Y:\javaprogramme>java Week6a
press ctrl+c to  stop
1 produced
1 consumed
2 produced
2 consumed
3 produced
3 consumed
4 produced
4 consumed
5 produced
5 consumed
6 produced
6 consumed
7 produced
7 consumed
8 produced
8 consumed
9 produced
9 consumed
10 produced
10 consumed
11 produced
11 consumed
12 produced
12 consumed
13 produced
13 consumed
14 produced
14 consumed
15 produced
15 consumed
16 produced
16 consumed
17 produced
17 consumed
18 produced
18 consumed
19 produced
19 consumed
20 produced
20 consumed

Y:\javaprogramme>java Week6a
*/