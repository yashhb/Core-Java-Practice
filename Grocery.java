class Grocery
{
	static int w=20;
	void addw()
	{
		w=w+15;
		System.out.println("Weight Added");
	}
	void removew()
	{
		w=w-10;
		System.out.println("Weight Removed");
	}
	void displayw()
	{
		System.out.println("Actual Weight is : "+ w);
	}
	public static void main(String[] args)
	{
		System.out.println("Actual Weight : "+ w);
		Grocery g = new Grocery();
		g.addw();
		g.removew();
		g.displayw();
	}
}