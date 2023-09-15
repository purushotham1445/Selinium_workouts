package TRRoundQuestions;

public class AlphabetorNot {
	public static void main(String[] args) {
		char ch = '@';
		if(ch >= 65 && ch <= 91 || ch >= 97 && ch <= 123 ) {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Not Alphabet");
		}
	}
}