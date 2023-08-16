package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIstMethods 
{
	public static void main(String[] args)
	{
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("Devu");// add the elements in array list
		obj.add("Nidhi");
		obj.add("Nidheesh");
		obj.add("Dhannu");
		obj.add("Annu");
		obj.add("malu");
		{
			System.out.println(obj);
		}
		
		obj.remove(2);//remove the element in particular index
		System.out.println(obj);
		
		ArrayList<String>obj1=new ArrayList<String>();
	obj1.add("DEVIKA");
		obj1.add("Nidhika");
		obj1.add("Malavika");
		{
			System.out.println(obj1);
		}
obj.addAll(obj1);
System.out.println(obj);

	ArrayList<String>obj3=new ArrayList<String>();
	obj3.add("Don");
		obj3.add("Neem");
		obj3.add("Monkey");
		{
			System.out.println(obj3);
		}
		obj3.removeAll(obj3);//remove all elements in the array list
		{
		System.out.println(obj3);
		
}
		System.out.println(obj.get(5));// element that print 5 th index 
		System.out.println(obj.size());//total size or elements in the array list
		System.out.println(obj.contains("Malavika"));//the element is present or not in the array list(boolean type is shown)//true
		System.out.println(obj.contains("Abhi"));//false condition
		Iterator itr=obj.iterator();//It is used to fetch the one by one element in array list
		while(itr.hasNext())
			{
			System.out.println(itr.next());
			}
		System.out.println(obj);
		itr.remove();
		System.out.println(obj);	
}
}
