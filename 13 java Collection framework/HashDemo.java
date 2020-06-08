import java.util.*;
class HashDemo
{
	public static void main(String args[])
	{
		HashSet<Integer> h=new HashSet<Integer>(50);
		h.add(15);
		h.add(13);
		h.add(9);
		h.add(11);
		h.add(7);
		System.out.println(h);
		System.out.println(h.remove(7));
		System.out.println(h);
	}
}