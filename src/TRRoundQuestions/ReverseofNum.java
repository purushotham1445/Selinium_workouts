package TRRoundQuestions;

import java.util.Scanner;

public class ReverseofNum {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		int res;
		int sum=0;
		while(n>0) {
			res=n%10;
			sum=sum*10+res;
			n=n/10;
		}
		System.out.println("Reverse of Num is: "+sum);
	}
}