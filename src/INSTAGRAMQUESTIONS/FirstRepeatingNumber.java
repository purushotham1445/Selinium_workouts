package INSTAGRAMQUESTIONS;

import java.util.HashSet;

public class FirstRepeatingNumber {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,7,4,9};
		firstrepeatingnumber(arr1);
	}
	static void firstrepeatingnumber(int[] arr1) {
		int minimum = 0;
		HashSet hs = new HashSet();
		for(int i = arr1.length-1;i>=0;i--) {
			if(!hs.contains(arr1[i])){
				hs.add(arr1[i]);
			}
			else {
				minimum = i;
			}
		}
		if(minimum != 0) {
			System.out.println("First Repeating Number is: "+arr1[minimum]);
		}
	}
}