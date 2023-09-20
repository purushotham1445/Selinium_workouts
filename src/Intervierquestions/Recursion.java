package Intervierquestions;
import java.util.Scanner;
class Recursion
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Start and end values: ");
		Scanner os = new Scanner(System.in);
		int start=os.nextInt();
		int end=os.nextInt();
		evaluate(start,end);
	}
	public static void evaluate(int a, int b)
	{
		if( a<= b)
		{
			System.out.println(a);
			a++;
			evaluate(a, b);
		}
	}
}