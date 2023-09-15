package INSTAGRAMQUESTIONS;

public class SpanofArray {
	public static void main(String[] args) {
		int[] ar = {20,42,88,10,99,6};
		System.out.println(spanofarray(ar));
	}
	static int spanofarray(int[] ar) {
		int max = ar[0], min = ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i] > max) {
				max = ar[i];
			}
			if(ar[i] < min) {
				min = ar[i];
			}
		}
		return (max - min);
	}
}