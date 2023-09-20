package QUIZ;

public class AccessValues {
	public static void main(String[] args) {
		int[][] ar= {{5,2,9},{4,6,8}};
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
		}
	}
}