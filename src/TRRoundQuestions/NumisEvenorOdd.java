package TRRoundQuestions;

import java.util.Scanner;

public class NumisEvenorOdd {
	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		os.close();
		if(n%2 ==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
}