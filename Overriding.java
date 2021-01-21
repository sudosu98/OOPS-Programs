class Sample
{
	public void Count(int num)
	{
		for(int i=1;i<=0;i++)
		{
			System.out.println(i);
		}
	}
}
class Demo extends Sample
{
	public void Count(int num)
	{
		super.Count(5);
		for(int i=num;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
class Overriding
{
	public static void main(String[] args) {
		Demo d = new Demo();
		d.Count(5);
	}
}