package INSTAGRAMQUESTIONS;

import java.util.Arrays;

public class DuplicateElementsPresentorNot3 {
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8,9,0,1};
		Arrays.sort(ar);
		boolean ispresent = false;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] == ar[i+1]) {
				ispresent = true;
				break;
			}
		}
		System.out.println(ispresent);
	}
}