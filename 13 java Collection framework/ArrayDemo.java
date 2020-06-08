import java.util.*;
class ArrayDemo
{
	public static void main(String args[])
	{
		ArrayList<Integer> l = new ArrayList<Integer>(12);
		System.out.println(l.size());
		l.add(12);
		l.add(15);
		l.add(20);
		ArrayList<Integer> l1 = new ArrayList<Integer>(l);
		System.out.println(l1);
		l1.add(0,19);
		System.out.println(l1);
		l1.addAll(l);
		System.out.println(l1);
		l.clear();
		System.out.println(l1.get(3));
		l1.ensureCapacity(100);
		System.out.println(l1.size());
		System.out.println(l1.indexOf(12));
		l1.trimToSize();
		Collections.sort(l1);
		System.out.println(l1);
		Integer a[]=new Integer[l1.size()];
		a=l1.toArray(a);
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum=sum+a[i];
		System.out.println(sum);
	}
}