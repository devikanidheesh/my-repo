package myMaven;

public class FIinalKey 
{
	int a=5;//final // we get error
	void show()
	{
		a=7;
		System.out.println(a);
	}
public static void main(String args[])
{
	FIinalKey obj=new FIinalKey ();
	obj.show();
	
}
}
