package Examsolutions;
class Test8
{
	public static void meth(Long n)
	{
		System.out.println("Long");
	}
	public static void meth(Short n)
	{
		System.out.println("Short");
	}
	public static void meth(int n)
	{
		System.out.println("int");
	}

	public static void main(String[] args) {
		Short y=6;
		long z=7;
		meth(y);
		meth(z);
	}
}