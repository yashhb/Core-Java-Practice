import java.util.*;
class CalDist
{
	public static void main(String[] args)
	{
		int d,u,t,a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Initial Speed (u)");
		u=s.nextInt();
		System.out.println("Enter Time(t)");
		t=s.nextInt();
		System.out.println("Enter Acceleration (a)");
		a=s.nextInt();
		d= u*t + (a*t*t/2);
		System.out.println("Distance : " + d);
	}
}
