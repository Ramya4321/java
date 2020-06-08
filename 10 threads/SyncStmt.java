class Sync extends Thread
{
	c1 ob;int m;
	Sync(c1 obj, int x)
	{
		ob = obj; m=x; 
	}
	public void run()
	{
		synchronized(ob)
		{
			ob.mul(5);
		}
	}
}
class SyncStmt
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