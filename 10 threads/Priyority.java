/*
aim:
6B. Write a program that demonstrates time slicing among
equal priority threads, show that a lower priority thread’s
execution is deferred by the time slicing of higher-priority
threads.
*/
class ThreadDemo extends Thread
{
	int m=0;
	ThreadDemo(String s)
	{
		super(s);
	}
	public void run()
	{
		//try
		{
			while(m<1000000)
			{
				if(m%10000==0)
				{
					System.out.println(getName()+":"+m);
					//Thread.sleep(1000);
				}
					m++;
				
			}
		}
		/*catch(InterruptedException e)
		{
			System.out.println("producer caught");
		}*/s
	}
}
class Priyority
{
	public static void main(String args[])
	{
			ThreadDemo t1=new ThreadDemo("first thread");
			ThreadDemo t2=new ThreadDemo("second thread");
		//	System.out.println(t1.getName());
		//	System.out.println(t2.getName());
			t1.setPriority(Thread.MIN_PRIORITY);
			t2.setPriority(Thread.MAX_PRIORITY);
			t1.start();
			t2.start();
	}
}
/*
Y:\javaprogramme>java Week6b
first thread:0
second thread:0
second thread:10000
first thread:10000
second thread:20000
first thread:20000
second thread:30000
second thread:40000
second thread:50000
second thread:60000
first thread:30000
second thread:70000
second thread:80000
second thread:90000
second thread:100000
second thread:110000
second thread:120000
second thread:130000
second thread:140000
second thread:150000
second thread:160000
second thread:170000
first thread:40000
second thread:180000
second thread:190000
second thread:200000
second thread:210000
second thread:220000
second thread:230000
second thread:240000
second thread:250000
second thread:260000
second thread:270000
second thread:280000
second thread:290000
second thread:300000
second thread:310000
second thread:320000
second thread:330000
second thread:340000
second thread:350000
second thread:360000
second thread:370000
second thread:380000
second thread:390000
second thread:400000
second thread:410000
second thread:420000
second thread:430000
second thread:440000
second thread:450000
second thread:460000
first thread:50000
second thread:470000
first thread:60000
second thread:480000
second thread:490000
second thread:500000
first thread:70000
second thread:510000
second thread:520000
second thread:530000
first thread:80000
second thread:540000
first thread:90000
second thread:550000
second thread:560000
first thread:100000
second thread:570000
first thread:110000
first thread:120000
second thread:580000
first thread:130000
second thread:590000
first thread:140000
second thread:600000
first thread:150000
second thread:610000
second thread:620000
first thread:160000
second thread:630000
first thread:170000
second thread:640000
second thread:650000
first thread:180000
second thread:660000
second thread:670000
second thread:680000
first thread:190000
second thread:690000
first thread:200000
second thread:700000
second thread:710000
second thread:720000
first thread:210000
second thread:730000
second thread:740000
second thread:750000
second thread:760000
first thread:220000
second thread:770000
second thread:780000
second thread:790000
first thread:230000
second thread:800000
first thread:240000
second thread:810000
first thread:250000
first thread:260000
second thread:820000
second thread:830000
first thread:270000
second thread:840000
first thread:280000
second thread:850000
second thread:860000
first thread:290000
second thread:870000
second thread:880000
first thread:300000
second thread:890000
second thread:900000
first thread:310000
second thread:910000
second thread:920000
second thread:930000
first thread:320000
second thread:940000
second thread:950000
second thread:960000
second thread:970000
first thread:330000
second thread:980000
first thread:340000
second thread:990000
first thread:350000
first thread:360000
first thread:370000
first thread:380000
first thread:390000
first thread:400000
first thread:410000
first thread:420000
first thread:430000
first thread:440000
first thread:450000
first thread:460000
first thread:470000
first thread:480000
first thread:490000
first thread:500000
first thread:510000
first thread:520000
first thread:530000
first thread:540000
first thread:550000
first thread:560000
first thread:570000
first thread:580000
first thread:590000
first thread:600000
first thread:610000
first thread:620000
first thread:630000
first thread:640000
first thread:650000
first thread:660000
first thread:670000
first thread:680000
first thread:690000
first thread:700000
first thread:710000
first thread:720000
first thread:730000
first thread:740000
first thread:750000
first thread:760000
first thread:770000
first thread:780000
first thread:790000
first thread:800000
first thread:810000
first thread:820000
first thread:830000
first thread:840000
first thread:850000
first thread:860000
first thread:870000
first thread:880000
first thread:890000
first thread:900000
first thread:910000
first thread:920000
first thread:930000
first thread:940000
first thread:950000
first thread:960000
first thread:970000
first thread:980000
first thread:990000
*/