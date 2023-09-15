package INSTAGRAMQUESTIONS;

import java.util.Arrays;

public class SeparateZerosandNonzeros {
	public static void main(String[] args) {
		int[] arr = {0,10,43,27,0,98,75,59,191,0};
		int counter = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[counter] = arr[i];
				counter++;
			}
		}
		while(counter < arr.length) {
			arr[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(arr));
	}
}