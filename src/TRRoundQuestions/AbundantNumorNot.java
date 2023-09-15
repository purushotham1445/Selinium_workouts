package TRRoundQuestions;

import java.util.Scanner;

public class AbundantNumorNot {
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		int count =0;
		if(n>0) {
			for(int i=1;i<n;i++) {
				if(n%i==0) { 
					count =count+i;
				}
			}
		}
		if(count>n) {
			System.out.println(n+" is Abundant Number");
		}
		else {
			System.out.println(n+" is not Abundant Number");
		}
	}
}