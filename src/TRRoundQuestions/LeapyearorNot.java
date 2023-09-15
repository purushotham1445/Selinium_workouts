package TRRoundQuestions;

import java.util.Scanner;

public class LeapyearorNot {
	public static void main(String[] args) {
		System.out.println("Enter the Year: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		if(n%4==0) {
			System.out.println(n+" is Leap Year");
		}
		else {
			System.out.println(n+" is not Leap Year");
		}
	}
}