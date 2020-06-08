import java.util.*;
class LinkedDemo
{
	public static void main(String args[])
	{
		LinkedList<String> l = new LinkedList<String>();
		l.add("SVEC");
		l.add("SVDC");
		l.add("SVIS");
		System.out.println(l);
		l.add(1,"SVIM");
		System.out.println(l);
		l.addFirst("SVET");
		System.out.println(l);
		l.addLast("SVCP");
		System.out.println(l);
		System.out.println(l.remove(1));
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.add("SVEC");
		l.add("SVDC");
		l.add("SVIS");
		System.out.println(l);
		l.set(3,"CSSE");
		System.out.println(l);
		LinkedList<String> l1=new LinkedList<String>(l);
		System.out.println("list 1 : "+l1);
	}
}