package collection;

import java.util.ArrayList;

public class ArrayListMethodsNonGeneric 
{

	public static void main(String[] args) 
	{
		
		ArrayList obj=new ArrayList ();
		obj.add("Devu");
		obj.add(29);
		obj.add(4);
		obj.add("nidhi");
		obj.add("Annu");
		obj.add(2.5f);
		{
	System.out.println(obj);
	obj.remove(2);//remove the element in particular index
	System.out.println(obj);
}
		
}
	}