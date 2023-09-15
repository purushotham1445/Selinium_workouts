package Examsolutions;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner os = new Scanner(System.in);
		String str1 = os.nextLine();
		String str2 = "";
		for(int i = 0;i<str1.length();i++) {
			if(!str2.contains(String.valueOf(str1.charAt(i)))) {
				str2 = str2.concat(String.valueOf(str1.charAt(i)));
			}
		}
		System.out.println(str2);
	}
}