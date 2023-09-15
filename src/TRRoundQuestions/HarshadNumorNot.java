package TRRoundQuestions;

import java.util.Scanner;

public class HarshadNumorNot {
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		int temp=n;
		int val;
		int res=0;
		while(n>0) {
			val=n%10;
			res=res+val;
			n=n/10;
		}
		if(temp%res==0) {
			System.out.println(temp+" is Harshad Number");
		}
		else {
			System.out.println(temp+" is not Harshad Number");
		}
	}
}