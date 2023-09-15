package TRRoundQuestions;

import java.util.Scanner;

public class SumofDigitsofNum {
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		int res;
		int count=0;
		while(n>0) {
			res=n%10;
			count=count+res;
			n=n/10;
		}
		System.out.println("Sum of Digits is: "+count);
	}
}