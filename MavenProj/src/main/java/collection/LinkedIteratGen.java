package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedIteratGen {

	public static void main(String[] args) 
	{
		LinkedList obj=new LinkedList();
	
	obj.add(15);
	obj.add(20);
	obj.add("DEVU");
	obj.add(2.5f);
	Iterator itr=obj.iterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
	}

}
