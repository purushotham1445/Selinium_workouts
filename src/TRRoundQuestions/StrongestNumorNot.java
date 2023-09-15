package TRRoundQuestions;

import java.util.Scanner;

public class StrongestNumorNot {
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		if(isstrongestNum(n)) {
			System.out.println(n+" is Strongest Number");
		}
		else {
			System.out.println(n+" is not Strongest Number");
		}
	}
	static boolean isstrongestNum(int n) {
		int originalnum =n;
		int sumoffactnum=0;
		int val;
		while(n>0) {
			 val =n%10;
			 sumoffactnum = sumoffactnum + factnum(val);
			 n=n/10;
		}
		if(originalnum==sumoffactnum) {
			return true;
		}
		else {
			return false;
		}
	}
	static int factnum(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*factnum(n-1);
	}
}