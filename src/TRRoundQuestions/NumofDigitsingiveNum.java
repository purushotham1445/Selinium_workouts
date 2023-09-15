package TRRoundQuestions;

import java.util.Scanner;

public class NumofDigitsingiveNum {
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("No of Digits is: "+count);
	}
}