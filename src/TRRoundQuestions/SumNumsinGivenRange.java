package TRRoundQuestions;

import java.util.Scanner;

public class SumNumsinGivenRange {
	public static void main(String[] args) {
		System.out.println("Enter Start and End Value: ");
		Scanner os = new Scanner(System.in);
		int start=os.nextInt();
		int end = os.nextInt();
		int count=0;
		for(int i =start;i<=end;i++) {
			count=count+i;
		}
		System.out.println("Sum is in the Given Range: "+count);
	}
}