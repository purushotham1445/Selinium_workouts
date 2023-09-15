package TRRoundQuestions;

import java.util.Scanner;

public class NumisPosorNeg {
	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		os.close();
		if(n > 0) {
			System.out.println("Positive Number");
		}
		else if(n < 0) {
			System.out.println("Negative Number");
		}
		else {
			System.out.println("Equal to Zero");
		}
	}
}