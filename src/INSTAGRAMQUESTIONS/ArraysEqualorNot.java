package INSTAGRAMQUESTIONS;

import java.util.Arrays;

public class ArraysEqualorNot {
	public static void main(String[] args) {
		int[] arr1 = {1,2,5,4,0};
		//int[] arr1 = {1,2,4,5,0};
		int[] arr2 = {1,2,5,4,0};
		boolean result = Arrays.equals(arr1, arr2);
		if(result) {
			System.out.println("Two Arrays are equal");
		}
		else {
			System.out.println("Two Arrays are not equal");
		}
	}
}