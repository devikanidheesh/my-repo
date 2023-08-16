package exception;

public class ArrayException 
{
	public static void main(String[] args) {
	try {	
	int a[]= {1,2,3,4};
	for(int i=0;i<=a.length;i=i+2)
	{
		System.out.println(a[i]);
	}
	}
	catch(Exception e)
	{
System.out.println(e);
	}

}
}