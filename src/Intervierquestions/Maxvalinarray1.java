package Intervierquestions;
import java.util.Arrays;
class Maxvalinarray1
{
	public static void main(String[] args)
	{
		int[] arr= {30,40,10,20,50,80,60,70,90,100};
		Arrays.sort(arr);
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
