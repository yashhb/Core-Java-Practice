class ObjectCounter
{
	public static int counter;
	public ObjectCounter()
	{
		counter++;
	}
}
class PrintObject
{
	public static void main(String[] args)
	{
		ObjectCounter obj=new ObjectCounter();
		System.out.println("Total Number of Objects : "+ObjectCounter.counter);
		ObjectCounter obj1=new ObjectCounter();
		ObjectCounter obj2=new ObjectCounter();
		System.out.println("Total Number Of Objects : "+ObjectCounter.counter);
	}
}