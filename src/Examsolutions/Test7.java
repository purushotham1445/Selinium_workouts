package Examsolutions;
class shape
{
	public void draw()
	{
		System.out.println("Drawing a shape");
	}
}
class circle extends shape
{
	public void draw()
	{
		System.out.println("Drawing a circle");
	}
}
class Rectangle extends shape
{
	public void draw()
	{
		System.out.println("Drawing a rectangle");
	}
}
public class Test7
{
	public static void main(String[] args)
	{
		shape s = new circle();
		s.draw();
	}
}