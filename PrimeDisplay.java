class PrimeDisplay
{
	public static void main(String[] args)
	{
		for(int i=1 ; i<=20 ; i++)
		{
			if(i!=2 && i!=3 && i!=5)
			{
				if( i%2!=0 && i%3!=0 && i%5!=0 )
				{
					System.out.println(i);
				}
			}
			else
				System.out.println(i);
		}
	}
}