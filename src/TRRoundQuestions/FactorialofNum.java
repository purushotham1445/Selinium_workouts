package TRRoundQuestions;

import java.util.Scanner;

public class FactorialofNum {
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		System.out.println(fact(n));
	}
	static int fact(int n) {
		int res=1;
		for(int i=n;i>=1;i--) {
			res = res*i;
		}
		return res;
	}
}