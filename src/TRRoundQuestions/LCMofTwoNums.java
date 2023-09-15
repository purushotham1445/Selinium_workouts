package TRRoundQuestions;

import java.util.Scanner;

public class LCMofTwoNums {
	public static void main(String[] args) {
		System.out.println("Enter the Two numbers");
		Scanner os = new Scanner(System.in);
		int num1 = os.nextInt();
		int num2 = os.nextInt();
		double gcd=findgcd(num1, num2);
		double lcm=(num1 * num2)/gcd;
		System.out.println("LCM of "+num1+" and "+num2+" is: "+lcm);
	}
	public static double findgcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return findgcd(b,a%b);
	}
}