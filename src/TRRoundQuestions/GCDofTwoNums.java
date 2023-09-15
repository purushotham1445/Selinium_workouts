package TRRoundQuestions;

import java.util.Scanner;

public class GCDofTwoNums {

	public static void main(String[] args) {
		System.out.println("Enter two Numbers");
		Scanner os = new Scanner(System.in);
		int n1 = os.nextInt();
		int n2 = os.nextInt();
		System.out.println(findgcd(n1,n2));
	}
	static int findgcd(int a, int b) {
		if(b ==0) {
			return a;
		}
		return findgcd(b, a%b);
	}
}