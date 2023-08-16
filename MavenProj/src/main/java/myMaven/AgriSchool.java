package myMaven;

public class AgriSchool
{
	String schoolname;
	int  pin;
	AgriStudent obj;
	 AgriSchool(String schoolname,int pin,AgriStudent obj)
	 {
		this.schoolname=schoolname;
		this.pin=pin;
		this.obj=obj;
	 }
	 public void show()
	 {
		 System.out.println(obj.name+"  "+obj.age);
		 System.out.println(schoolname+"   "+pin );
		 
	 }
	public static void main(String[] args) 
	{
	
	AgriStudent obj=new AgriStudent("Nidhika",7);
	AgriSchool sch=new AgriSchool("SV school",695013,obj);
	sch.show();
	}

}
