package Intervierquestions;
import java.util.Scanner;
class Recursion1
{
	public static void main(String[] args)
	{
		System.out.println("Enter the nth, start and end values: ");
		Scanner os = new Scanner(System.in);
		int n=os.nextInt();
		int start=os.nextInt();
		int end=os.nextInt();
		evaluate(n, start, end);
	}
	public static void evaluate(int a, int b, int c)
	{
		if(b <= c)
		{
			System.out.println(a+"*"+b+"="+(a*b));
			b++;
			evaluate(a,b,c);
		}
	}
}