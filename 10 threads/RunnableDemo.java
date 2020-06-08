class RunnableClass implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				System.out.println("child thread"+i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("child exception");
			}
		}
	}
}
class RunnableDemo
{
	public static void main(String[] args)
	{
		RunnableClass r = new RunnableClass();	
		Thread t = new Thread(r);
		t.start();//start in thread class//it calls run()
		for(int i=0;i<5;i++)
		{
			try
			{
				System.out.println("main thread"+i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("main exception");
			}
		}
	}
}