import java.util.*;
class EmployeeDetails
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		EmployeeDetails ed=new EmployeeDetails();
		System.out.println("-------Menu-------");	
		System.out.println("1. Enter Data");
		System.out.println("2. Display Data");
		System.out.println("3. Exit");
		System.out.println("Enter your choice :");
		int o=s.nextInt();
		switch(o)
		{
		case 1:	
		{
			ed.EnterData();
			break;
		}
		case 2:
		{
			ed.DisplayData();
			break;
		}
		case 3:
		{
			ed.Exit();
			break;
		}
		}
	}
	void EnterData()
	{
		System.out.println("Enter Data Method is invoked");
	}
	void DisplayData()
	{
		System.out.println("Display Data Method is invoked");
	}
	void Exit()
	{
		System.out.println("Exit Method is invoked");
	}	
}