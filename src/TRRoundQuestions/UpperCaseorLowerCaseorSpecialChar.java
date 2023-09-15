package TRRoundQuestions;

public class UpperCaseorLowerCaseorSpecialChar {
	public static void main(String[] args) {
		char ch = '^';
		if(Character.isUpperCase(ch)) {
			System.out.println(ch+" is Upper Case Character");
		}
		else if(Character.isLowerCase(ch)) {
			System.out.println(ch+" is Lower Case Character");
		}
		else {
			System.out.println(ch+" is Special Character");
		}
	}
}