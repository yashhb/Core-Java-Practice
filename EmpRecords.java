import java.util.*;
class EmpRecords
	{
	public static void main(String[] args)
	{
		int i,n;
		Scanner s=new Scanner(System.in);
		System.out.print("How many Details you want to Enter :");
		n=s.nextInt();
		String a[][]=new String[n][7];
		String id,dj,db;
		String name,dpt,dsg,ms;
		for(i=0;i<n;i++)
		{
			int m=i;
			System.out.println("Enter " + ++m + " Employee detail" );
			System.out.print("Enter Employee Name : ");
			a[i][0]=s.next();	
			System.out.print("Enter Employee Id : ");
			a[i][1]=s.next();
			System.out.print("Enter Employee Date of Joining : ");
			a[i][2]=s.next();
			System.out.print("Enter Employee Date of Birth : ");
			a[i][3]=s.next();
			System.out.print("Enter Employee Department : ");
			a[i][4]=s.next();
			System.out.print("Enter Employee Designation : ");
			a[i][5]=s.next();
			System.out.print("Enter Employee Marital Status : ");
			a[i][6]=s.next();
		}
		System.out.println("Employee Deatils are :");
		for(i=0;i<n;i++)
		{
			int p=i;
			System.out.println("Details of " + ++p + " Employee");
			System.out.println("Employee Name : " + a[i][0]);
			System.out.println("Employee Id : " + a[i][1]);
			System.out.println("Employee Date of Joining : " + a[i][2]);
			System.out.println("Employee Date of Birth : " + a[i][3]);
			System.out.println("Employee Department : " + a[i][4]);
			System.out.println("Employee Designation : " + a[i][5]);
			System.out.println("Employee Martital Status : " + a[i][6]);
		}
	}
}