package TRRoundQuestions;

import java.util.Scanner;

public class PowofNum1 {
	public static void main(String[] args) {
		System.out.println("Enter the Number and how many multiples: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		int k = os.nextInt();
		int res =1;
		for(int i=1;i<=k;i++) {
			res = res * n;
		}
		System.out.println(res);
	}
}