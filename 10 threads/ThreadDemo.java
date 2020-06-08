class Newthread extends Thread
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
class ThreadDemo
{
	public static void main(String[] args)
	{
		Newthread t = new Newthread();
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