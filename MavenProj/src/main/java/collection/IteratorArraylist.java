package collection;

import java.util.*;

public class IteratorArraylist {

	public static void main(String[] args) 
	{
		ArrayList<String> list =new ArrayList<String>();
		list.add("DEVU");
		list.add("NIDHI");
		list.add("DHANNU");
		list.add("ANNU");
		list.add("MALU");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
	}

}

