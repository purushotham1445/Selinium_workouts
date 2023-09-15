package Examsolutions;
class T
{
	final int i;
	T(int a)
	{
		i=a;
	}
}
class Test9
{
	public static void main(String[] args)
	{
		T t1 = new T(5);
		T t2 = new T(10);
		System.out.println(t1.i);
		System.out.println(t2.i);
	}
}