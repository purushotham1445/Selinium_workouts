package LEARNINGMONKEY;

public class No_20_CountSpaces {
	public static void main(String[] args) {
		String str="Java Dbms sql html css selenium mannualtesting cucumber testng";
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				count++;
			}
		}
		System.out.println(count);
		
		/*String[] strarr=str.split(" ");
		System.out.println(strarr.length-1);*/
	}
}