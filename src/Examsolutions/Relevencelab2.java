package Examsolutions;

class Relevencelab2
{
	public static void main(String[] args)
	{
		int[] array = {4,3,-7,4,6,2,-12,6,9,12,-27,1,4,6,9,5,5,-30};
		int value = 0;
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+",");
			value += array[i];
			if (value == 0)
			{
				System.out.println();
			}
		}
	}
}