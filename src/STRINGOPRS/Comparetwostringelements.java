package STRINGOPRS;
class Comparetwostringelements
{
	public static void main(String[] args)
	{
		String[] vals= { "a","b","c","d","e","f","g","h"};
		for(int i=0;i<vals.length-1;i++)
		{
			String vals1=vals[i];
			String vals2=vals[i+1];
			System.out.println(vals1+":::"+vals2+":::"+vals1.compareTo(vals2));
		}
	}
}
