package TRRoundQuestions;

import java.util.Scanner;

public class AreaofCircle {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		os.close();
		double res = 3.14 *(n*n);
		System.out.println(res);
	}
}