package TRRoundQuestions;

import java.util.Scanner;

public class AutomorphicNumorNot {
	public static void main(String[] args) {
		System.out.println("Enter the Numbers");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		if(isAutomorphicnum(n)) {
			System.out.println(n+" is Automorphic Number");
		}
		else {
			System.out.println(n+" is not a Automorphic Number");
		}
	}
	static boolean isAutomorphicnum(int n) {
		int square = n*n;
		while(n>0) {
			if(n%10 != square%10) {
				return false;
			}
			n=n/10;
			square=square/10;
		}
		return true;
	}
}