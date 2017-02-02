import java.util.*;
import java.util.regex.*;
public class PatternMatch
{
	public static void main(String[] args)
	{
		String in;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Word : ");
		in=s.next();
		Pattern p = Pattern.compile("[abc]at");
		Matcher m = p.matcher(in);
		boolean b = m.matches();
		if(b)
		{
			System.out.println("Expression matched");
		}	
		else
		{
			System.out.println("Expression not matched");
		}
	}
}