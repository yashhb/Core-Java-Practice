import java.util.*;
class Table
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int i,j;
		System.out.print("Enter the Number whose Table you want to Print : ");
		i=s.nextInt();
		for(j=1 ; j<11 ; j++)
		{
			System.out.println( i + " X " + j + " = " + i*j);
		}
	}
}