package INSTAGRAMQUESTIONS;

import java.util.Arrays;

public class SecondLargestArrayElement {
	public static void main(String[] args) {
		int[] arr = {10,43,27,98,75,59,191};
		Arrays.sort(arr);
		//System.out.println(arr[arr.length-2]);
		for(int i = 0;i<arr.length;i++) {
			if(i == arr.length-2) {
				System.out.println(arr[i]);
			}
		}
	}
}