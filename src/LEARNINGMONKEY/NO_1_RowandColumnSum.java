package LEARNINGMONKEY;

public class NO_1_RowandColumnSum {
	public static void main(String[] args) {
		int[][] ar= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int i,j,sum=0;
		System.out.println("Row Sum: ");
		for(i=0;i<ar.length;i++) {
			sum=0;
			for(j=0;j<ar[i].length;j++) {
				sum=sum+ar[i][j];
			}
			System.out.println(i+1+" Line Sum is: "+sum);
		}
		System.out.println("Column Sum: ");
		for(i=0;i<ar.length;i++) {
			sum=0;
			for(j=0;j<ar.length;j++) {
				sum=sum+ar[j][i];
			}
			System.out.println(j+1+" Line Sum is: "+sum);
		}
	}	
}