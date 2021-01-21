class Sample
{
	public Sample()
	{
		System.out.println("SuperClass2");
	}
}
class Demo extends Sample
{
	public Demo()
	{
		super();
		System.out.println("SuperClass1");
	}
}
class Demo2 extends Demo
{
	public Demo2()
	{
		super();
		System.out.println("SubClass1");
	}
}
class ConstructorChaining
{
	public static void main(String[] args) {
		Demo2 d = new Demo2();
	}
}