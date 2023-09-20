package Intervierquestions;

import java.util.Scanner;

class AvgOfArrayValues
{
	public static void main(String[] args)
	{
		System.out.println("How many values do you want:");
		Scanner os = new Scanner(System.in);
		int n = os.nextInt();
		int[] m= new int[n];
		int total = 0;
		System.out.println("Enter "+n+" values:");
		for(int i =0;i<n;i++)
		{
			m[i]=os.nextInt();
			total = total+m[i];
		}
		double avg = total/n;
		System.out.println("Average is: "+avg);
	}
}