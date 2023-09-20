//Addition of Two Nums without + operator
package INSTAGRAMQUESTIONS;

import java.util.Scanner;

public class AdditionofNumswithoutOperator {
	public static void main(String[] args) {
		Scanner os = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = os.nextInt();
		System.out.println("Enter b value: ");
		int b = os.nextInt();
		//int c = a - (-(b));
		int c = -((-a)-(-(-b)));
		System.out.println("Addition of a and b is: "+c);
	}
}