package collection;

import java.util.*;

public class NonGeneric {

	public static void main(String[] args)
	{
		ArrayList obj=new ArrayList();
		obj.add(10);	
		obj.add("DEVU");
		obj.add(7.3f);
		obj.add("MALU");
		obj.add(2.25f);
		Iterator itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
