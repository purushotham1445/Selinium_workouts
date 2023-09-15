package LEARNINGMONKEY;

public class NO_12_IsEmptyMethod {
	public static void main(String[] args) {
		String str1="java";
		String str2="";
		System.out.println(str1.isBlank());
		System.out.println(str1.isEmpty());
		System.out.println(str2.isBlank());
		System.out.println(str2.isEmpty());  //isBlank() and isEmpty() is same.
	}
}