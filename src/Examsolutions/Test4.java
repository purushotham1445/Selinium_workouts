package Examsolutions;
interface Mammal
{
	public void giveBirth();
}
class Human implements Mammal
{
	public void giveBirth()
	{
		System.out.println("Giving birth to a baby");
	}
}
class Whale implements Mammal
{
	public void giveBirth()
	{
		System.out.println("Giving birth to a Calf");
	}
}
class Test4
{
	public static void main(String[] args)
	{
		Mammal m = new Whale();
		m.giveBirth();
	}
}