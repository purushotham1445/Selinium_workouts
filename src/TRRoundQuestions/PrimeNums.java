package TRRoundQuestions;

import java.util.Scanner;

public class PrimeNums {
	public static void main(String[] args) {
		System.out.println("Enter upto Number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		for(int i=1;i<=n;i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}
	}
	static boolean isprime(int n) {
		if(n==1) {
			return false;
		}
		if(n==2 || n==3) {
			return true;
		}
		if(n%2 ==0 || n%3== 0) {
			return false;
		}
		for(int i=5;i*i<=n;i++) {
			if(n%i==0 || n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
}