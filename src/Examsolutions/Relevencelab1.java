package Examsolutions;

class Relevencelab1
{
	public static void main(String[] args)
	{
		int[] array = {3,4,2,7,4,6,1,8};
		int num = 9;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i]+ array[j] == num)
				{
					System.out.println(array[i]+","+array[j]);
				}
			}
		}
	}
}