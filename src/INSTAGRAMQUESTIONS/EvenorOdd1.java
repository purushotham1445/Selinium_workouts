// Find Number is Even or Odd without % operator
package INSTAGRAMQUESTIONS;

import java.util.Scanner;

public class EvenorOdd1 {
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		FindEvenorOdd(n);
	}
	static void FindEvenorOdd(int n) {
		if(n == 0) {
			System.out.println("Even Number");
		}
		else if(n == 1) {
			System.out.println("Odd Number");
		}
		else{
			FindEvenorOdd(n-2);
		}
	}
}