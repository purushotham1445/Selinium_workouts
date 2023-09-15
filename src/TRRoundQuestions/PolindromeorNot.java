package TRRoundQuestions;

import java.util.Scanner;

public class PolindromeorNot {
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner os = new Scanner(System.in);
		String str=os.nextLine();
		System.out.println(isPolindrome(str,0,str.length()-1));
	}
	static boolean isPolindrome(String str, int start, int end) {
		if(str.charAt(start) != str.charAt(end)) {
			return false;
		}
		while(start>=end) {
			return true;
		}
		return isPolindrome(str,start+1,end-1);
	}
}