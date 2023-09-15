package TRRoundQuestions;

import java.util.Scanner;

public class GretestofNums {
	public static void main(String[] args) {
		System.out.println("Enter the Numbers: ");
		Scanner os = new Scanner(System.in);
		int a= os.nextInt();
		int b=os.nextInt();
		int c=os.nextInt();
		int big=Math.max(a, b);
		int res=Math.max(big, c);
		System.out.println(res);
	}
}