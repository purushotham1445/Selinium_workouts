// Find Number is Even or Odd without % operator
package INSTAGRAMQUESTIONS;

import java.util.Scanner;

public class EvenorOdd2 {
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		int result = n/2;
		if((result*2) == n) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
}