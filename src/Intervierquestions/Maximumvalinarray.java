package Intervierquestions;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class Maximumvalinarray
{
	public static void main(String[] args)
	{
		int[] values= {20,50,10,45,50,34,50,20,25,33};
		int nmax= getnmaxval(values, 1);
		System.out.println(nmax);
	}
	public static int getnmaxval(int[] values, int n)
	{
		Set<Integer> unique= new TreeSet<>();
		for(int val: values)
		{
			unique.add(val);
		}
		List<Integer> lstvals= new ArrayList<>(unique);
		return lstvals.get(lstvals.size()-n);
		
	}
}
