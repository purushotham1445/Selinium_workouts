package Examsolutions;
class base
{
	public void foo()
	{
		System.out.println("In base");
	}
}
class derived extends base
{
	public void foo()
	{
		System.out.println("in derived");
	}
}
class Test
{
	public static void main(String[] args)
	{
		base b=new derived();
		b.foo();
	}
}