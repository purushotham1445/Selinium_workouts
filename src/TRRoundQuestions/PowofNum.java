package TRRoundQuestions;

import java.util.Scanner;

public class PowofNum {
	public static void main(String[] args) {
		System.out.println("Enter the Number and How many times Multiple ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		int k=os.nextInt();
		double res= Math.pow(n, k);
		System.out.println(res);
	}
}