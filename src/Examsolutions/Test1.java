package Examsolutions;
class A
{
	int x=10;
}
class B extends A
{
	int y=20;
}
class Test1
{
	public static void main(String[] args)
	{
		A a1= new B();
		System.out.println(a1.x);
	}
}