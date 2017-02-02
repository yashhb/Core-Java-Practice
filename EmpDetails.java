class EmpDetails
{
	int id;
	String name;
	String desig;
	String dept;
	public EmpDetails()
	{
		id=1;
		name="Yash";
		desig="Manager";
		dept="comp";
	}
	public String toString()
	{
		StringBuffer sb=new StringBuffer();
		sb.append("Employee Details are : \n");
		sb.append("Employee ID : "+id+"\n");
		sb.append("Employee Name : "+name+"\n");
		sb.append("Employee Designation : "+desig+"\n");
		sb.append("Employee Department : "+dept+"\n");
		return sb.toString();
	}
	public static void main(String[] args)
	{
		EmpDetails obj=new EmpDetails();
		System.out.println(obj);
	}
}