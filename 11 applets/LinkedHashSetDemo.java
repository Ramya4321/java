import java.util.*;
class LinkedHashSetDemo
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		l.add("svec");l.add("csse");l.add("it");l.add("cse");
		System.out.println(l);
		l.remove("svec");
		LinkedHashSet<String> l1 = new LinkedHashSet<String>(l);
		System.out.println(l1);
		LinkedHashSet<String> l2 = new LinkedHashSet<String>(15);
		LinkedHashSet<String> l3 = new LinkedHashSet<String>(17,0.75f);
		System.out.println(l3);
	}
}
/*
C:\Users\Rayapati Nikhil\Desktop\Ramya\B tech\2-1 java ds os\java\11 applets>java LinkedHashSetDemo
[svec, csse, it, cse]
[csse, it, cse]
[]
*/