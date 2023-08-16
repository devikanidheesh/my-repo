package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class NonGenLink 
{

	public static void main(String[] args)
{
		LinkedList obj=new LinkedList();
obj.add("DEVIKA");
obj.add(5);
obj.add(7.2);
/*Iterator itr=obj.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}*/
System.out.println(obj);
obj.add(1,45);//add no:  index position and which no: we add
System.out.println(obj);
obj.addFirst("FLOWER");//add first
System.out.println(obj);
obj.addLast("Rose");//add last
System.out.println(obj);
System.out.println(obj.indexOf("DEVIKA"));//position
System.out.println(obj.contains("DEVIKA"));//contains true
System.out.println(obj.contains(15));//contains false
System.out.println(obj.peekLast());//last content print
System.out.println(obj.peekFirst());//first content print
System.out.println(obj);
System.out.println(obj.pollFirst());//remove last content and print
System.out.println(obj);
System.out.println(obj.pollLast());///remove last content and print   
System.out.println(obj);//remove last content and print
}
}



