package TRRoundQuestions;

import java.util.Scanner;

public class AddTwoFractions {
	public static void main(String[] args) {
		Scanner os = new Scanner(System.in);
		System.out.println("Enter the first Numerator: ");
		int numerator1 = os.nextInt();
		System.out.println("Enter the first Denominator: ");
		int denominator1 = os.nextInt();
		System.out.println("Enter the second Numerator: ");
		int numerator2 = os.nextInt();
		System.out.println("Enter the second Denominator: ");
		int denominator2 = os.nextInt();
		
		double numerator3 = (numerator1*denominator2)+(numerator2*denominator1);
		double denominator3=(denominator1*denominator2);
		double result = numerator3/denominator3;
		System.out.print(numerator1+"/"+denominator1+" + "+numerator2+"/"+denominator2+" => "+numerator3+"/"+denominator3+" => "+result);
	}
}