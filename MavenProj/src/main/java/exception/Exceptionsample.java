package exception;

public class Exceptionsample
{
public void add()
{
	int a=10;
	try
	{
	int b=a/0;
	System.out.println(b);
	}
catch(Exception e)
	{
	System.out.println(e);
	}
}

	public static void main(String[] args)
	{
	
		Exceptionsample obj=new Exceptionsample();
		obj.add();
		
	}

}
