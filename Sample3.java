class Sample3
{
	static int v1;
	double z1 = 26.6;
	String name = "Oracle";
	public void test() 
	{
		System.out.println("test() of Sample3 class");
		System.out.println("v1 : "+v1);
		double z1 = 100.0;
		System.out.println("test - z1 : "+z1);
		System.out.println("Global z1 : "+this.z1); //this keyword is used to access Global variable from Sample3 Class only in a non-static method
	}
	public static void test2()
	{
		String name = "Oracle";
		System.out.println("My name is : "+name);
		System.out.println("My global name is : "+new Sample3().name);
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		int v1 = 2;
		new Sample3().test();
		test2();
		System.out.println("v1 main : "+v1);
		System.out.println("V1 Global : "+Sample3.v1);
		double z1 = 100.0;
		System.out.println("main - z1 : "+z1);
		System.out.println("Global z1 : "+new Sample3().z1);//New object must be created to access Global variable in a Static method
		System.out.println("End");
	}
}