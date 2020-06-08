class c1
{
	synchronized void mul(int n)
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				System.out.println(n*i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("child exception");
			}
		}		
	}
}
class Sync extends Thread
{
	c1 ob;int m;
	Sync(c1 obj, int x)
	{
		ob = obj; m=x; 
	}
	public void run()
	{
		ob.mul(m);
	}
}
class SyncDemo
{
		public static void main(String[] args)
		{
			c1 obje = new c1();
			Sync t1 = new Sync(obje,5);
			Sync t2 = new Sync(obje,10);
			t1.start();
			t2.start();
		}
}