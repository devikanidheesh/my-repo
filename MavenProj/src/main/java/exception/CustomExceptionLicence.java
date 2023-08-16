package exception;

public class CustomExceptionLicence 
{
void show(int a) throws LicenceException
{
	if(a<=18)
	{
		throw new LicenceException("invalid");
	}
	else
	{
		System.out.println("Valid");
	}
}
	public static void main(String[] args) throws LicenceException 
	{
		
		CustomExceptionLicence  obj=new CustomExceptionLicence ();
		obj.show(10);
	}
	}

