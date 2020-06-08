class c1
{//this is for SyncStmt
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