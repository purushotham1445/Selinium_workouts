package TRRoundQuestions;

import java.util.Scanner;

public class ArmStrongorNot {
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		int temp=n;
		int res;
		int val=0;
		while(n>0) {
			res=n%10;
			val = val+(res*res*res);
			n=n/10;
		}
		if(val==temp) {
			System.out.println(temp+" is Armstrong Number");
		}
		else {
			System.out.println(temp+" is not Armstrong Number");
		}
	}
}