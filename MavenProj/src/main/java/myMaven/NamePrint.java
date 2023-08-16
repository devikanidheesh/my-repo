package myMaven;

public class NamePrint extends Companyname
{
public void show()
{
	System.out.println("DEVIKA NIDHEESH");
}
public void display()
{
	super.show();
	show();
}
	public static void main(String[] args) 
	{
		NamePrint name=new NamePrint();
		name.display();

	}

}
