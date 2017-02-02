import java.util.*;
class CheckDiv
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number");
		int i = s.nextInt();
		System.out.println("Enter Second Number");
		int j = s.nextInt();
		if(i%j==0)
		{
			System.out.println("First Number is Divisible by Second Number ");
		}
		else
			System.out.println("Not Divisible");
	}
}