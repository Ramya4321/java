class RuntimePoly
{
	public static void main(String[] args)
	{
		StackInterface I1;
		StaticstackImp obj = new StaticstackImp(5);
		DynamicstackImp obj1 = new DynamicstackImp(5);
		int i;
		I1  = obj;
		for(i=0 ;i<6; i++)
			I1.push(i+10);
		for(i=0 ;i<6; i++)
			I1.pop();
		I1 = obj;
		for(i=0 ;i<6; i++)
			I1.push(i+10);
		for(i=0 ;i<6; i++)
			I1.pop();
	}
}
/*
in order to compile this there has to be a class file for
StackInterface, DynamicstackImp, StaticstackImp in the same folder.
*/
/*
10 pushed11 pushed12 pushed13 pushed14 pushedstack is overflowed
14 popped
13 popped
12 popped
11 popped
10 popped
under flow
10 pushed11 pushed12 pushed13 pushed14 pushedstack is overflowed
14 popped
13 popped
12 popped
11 popped
10 popped
under flow
*/