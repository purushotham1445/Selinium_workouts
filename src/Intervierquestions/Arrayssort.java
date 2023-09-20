package Intervierquestions;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
class Arrayssort
{
	public static void main(String[] args)
	{
		int[] vals = {43,20,65,15,68,88,65,30,120,20,10,55,50};
		/*Arrays.sort(vals);
		for(int val: vals)
		{
			System.out.println(val);
		}*/
		
		
		/*for(int i=0;i<=vals.length-2;i++)
		{
			for(int j=0;j<=vals.length-2;j++)
			{
				int val1=vals[j];
				int val2=vals[j+1];
				if(val1 > val2)
				{
					vals[j]= val2;
					vals[j+1]=val1;
				}
			}
		}
		for(int val: vals)
		{
			System.out.println(val);
		}*/	
		
		Set<Integer> sortvals=new TreeSet<>();
		for(int val: vals)
		{
			sortvals.add(val);
		}
		System.out.println(sortvals);
	}
}