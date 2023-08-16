package myMaven;

public class InterfaceClas implements SampleInter  
{
	public void show()
	{
	System.out.println("DEVIKA");
	}
public void display()
{
	System.out.println("Method in class");
}
	public static void main(String[] args)
	{
		
		InterfaceClas obj=new InterfaceClas();
		obj.show();
		obj.display();
		//SampleInter   obj1=new InterfaceClas ();
		//obj1.show();
		//obj1.display();
		
	}

}
