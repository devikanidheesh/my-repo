package myMaven;

public class SuperOver extends ClassChild
{
public void show()
{
	super.show();
	System.out.println("HELLO");
}

	public static void main(String[] args) 
	{
		{
			SuperOver obj=new SuperOver();
			obj.show();// TODO Auto-generated method stub
		}

	}

}
