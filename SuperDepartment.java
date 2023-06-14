package department_Project;

public class SuperDepartment {
	
	public String  departmentName()
	{
		return "Welcome to Super Department";
	}
	 
	public String getTodaysWork()
	{
		return "No Work as of now";
	}
  public  String getWorkDeadline()
  {
	   return "Nil";
  }
  
  public String isTodayAHoliday()
  {
	   return "Today is not a Holiday \n";
  }

	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	SuperDepartment obj1 = new AdminDepartment();
    SuperDepartment obj2 = new HrDepartment();
	SuperDepartment obj3 =new TechDepartment();
	HrDepartment Hr = new HrDepartment();
	TechDepartment tech = new TechDepartment();
	
	System.out.println(obj1.departmentName());
	System.out.println(obj1.getTodaysWork());
	System.out.println(obj1.getWorkDeadline());
	System.out.println(obj1.isTodayAHoliday());
	
	System.out.println(obj2.departmentName());
	System.out.println(Hr.doActivity());
	System.out.println(obj2.getTodaysWork());
	System.out.println(obj2.getWorkDeadline());
	System.out.println(obj2.isTodayAHoliday());
	
	System.out.println(obj3.departmentName());
	System.out.println(obj3.getTodaysWork());
	System.out.println(obj3.getWorkDeadline());
	System.out.println(tech.getTechStackInformation());
	System.out.println(obj3.isTodayAHoliday());
	

	}

}
