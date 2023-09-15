package INSTAGRAMQUESTIONS;

public class NumPattern1 {
	public static void main(String[] args) {
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=count;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			count+=2;
		}
	}
}