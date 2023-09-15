package TRRoundQuestions;

import java.util.Scanner;

public class Perfectnumornot {
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		int count =0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				count =count+i;
			}
		}
		if(n==count) {
			System.out.println(n+" is Perfect Number");
		}
		else {
			System.out.println(n+" is not Perfect Number");
		}
	}
}