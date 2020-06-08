class Demo
{
	void display() throws ArithmeticException//,ArrayIndexOutOfBoundException 
	{
		System.out.println(15/0);
	}
}
class ThrowsException
{
	 public static void main(String args[]) 
    { 
	 Demo d = new Demo();
	 try
	 {
		 d.display();
	 }
	 catch(ArithmeticException obj)
	 {
		 System.out.println("Caught in main."); 
	 }
	}
}
//Caught in main.