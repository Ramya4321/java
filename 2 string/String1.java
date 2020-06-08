import java.lang.String;
class String1
{
	public static void main(String[] args)
	{
		String s = new String();
		String s1 = "abc";
		System.out.println(s1);
		String s6 = new String("abc");
		System.out.println(s6);
		char data[]= {'a', 'b','c'};
		char[] dept ={'c','s','s','e'};
		byte[] b = {101,102,103,104,105,106,107,108};
		String s2 = new String(dept);
		String s3 = new String(dept,0,3);//start, how many
		String s4 = new String(b);
		String s5 = new String(b,3,4);
		System.out.println(s+" "+s2+" "+s3+" "+s4+" "+s5);
	}
}
/*
abc
abc
 csse css efghijkl hijk
csse
*/