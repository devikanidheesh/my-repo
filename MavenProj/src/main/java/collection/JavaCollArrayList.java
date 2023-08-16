package collection;

import java.util.*;

public class JavaCollArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
obj.add(5);	
obj.add(1);
obj.add(7);
obj.add(5);
obj.add(2);
for(int i:obj)
{
System.out.println(i);
	}
//Iterator itr=obj.iterator();
//while(itr.hasNext())
{
	//System.out.println(itr.next());
}
}
}
