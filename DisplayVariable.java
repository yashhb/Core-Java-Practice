class DisplayVariable
{
	int a=1;
	String s="Yash";
	void disp()
	{
		System.out.println("Name and Id are: "+ s+" "+a);
	}
	public static void main(String[] args)
	{
		DisplayVariable dv = new DisplayVariable();
		dv.disp();
	}
}