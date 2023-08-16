package collection;

import java.util.LinkedList;

public class MethodLinkedList
{

	public static void main(String[] args) 
	{
		LinkedList obj=new LinkedList();
		obj.add("CAR");
		obj.add(10);
		obj.add("BUS");
		obj.add(20);
		obj.add("AUTORICKSHA");
		obj.add(30);
		obj.add("BIKE");
		obj.add(40);
		System.out.println(obj);
		
	obj.add(0,5);
	System.out.println(obj);
	obj.addFirst("AEROPLANE");
	System.out.println(obj);
	obj.addLast("Scooter");
	System.out.println(obj);
	System.out.println(obj.indexOf("udaya"));
	System.out.println(obj);
	System.out.println(obj.contains("udaya"));
	System.out.println(obj.peekLast());
	System.out.println(obj.peekFirst());
	System.out.println(obj.pollLast());
	System.out.println(obj.pollFirst());
	System.out.println(obj);
}
}