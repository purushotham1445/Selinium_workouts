package INSTAGRAMQUESTIONS;

public class DuplicateElementsPresentorNot1 {
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8,9,0,1};
		boolean ispresent = false;
		for(int i=0;i<ar.length;i++) {
			for(int j=1;j<ar.length;j++) {
				if(ar[i] == ar[j]) {
					ispresent = true;
					break;
				}
			}
		}
		System.out.println(ispresent);
	}
}