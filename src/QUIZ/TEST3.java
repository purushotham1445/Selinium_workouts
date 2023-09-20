package QUIZ;

public class TEST3 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.m1();
		B b = new B();
		b.m2();
		B bc = new B();
		bc.m1();
	}
}
class A2
{
	public void m1()
	{
		System.out.println("Class A method");
	}
}
class B extends A2
{
	public void m2()
	{
		System.out.println("Class B method");
	}
}