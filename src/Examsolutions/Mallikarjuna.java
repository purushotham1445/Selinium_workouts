//Write a Programme to display the 1st, 2nd, 3rd and 4th multiple of 7 which gives remainder is 1 when devided by 2,3,4,5 and 6
package Examsolutions;

public class Mallikarjuna {
	public static void main(String[] args) {
		int count =0, num = 7;
		for(int i = 1;count<4;i++) {
			if(i%2 ==1 && i%3 == 1 && i%4 == 1 && i%5 == 1 && i%6 ==1) {
				System.out.println(num);
				count++;
			}
			num = num +7;
		}
	}
}