package Examsolutions;

import java.util.Scanner;

public class CountNumbersinString {
	public static void main(String[] args) {
		Scanner os = new Scanner(System.in);
		String str = os.nextLine();
		int count = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) > 48 && str.charAt(i) < 57) {
				count = count + (Integer.parseInt(String.valueOf(str.charAt(i))));
			}
		}
		System.out.println(count);
	}
}