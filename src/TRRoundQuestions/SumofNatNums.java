package TRRoundQuestions;

import java.util.Scanner;

public class SumofNatNums {
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		double res = (n*(n+1))/2;
		System.out.println("Sum of Natural Number is: "+res);
	}
}