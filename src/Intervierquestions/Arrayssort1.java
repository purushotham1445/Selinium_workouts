package Intervierquestions;
class Arrayssort1
{
	public static void main(String[] args)
	{
		String[] vals = {"Purushotham", "Naresh","Tharun","Naveen","Prathyusha","Shirisha"};
		for(int i=0;i<=vals.length-2;i++)
		{
			for(int j=0;j<=vals.length-2;j++)
			{
				String val1 = vals[j];
				String val2 = vals[j+1];
				if(val1.compareTo(val2) > 0)
				{
					vals[j+1]=val1;
					vals[j]=val2;
				}
			}
		}
		for(String val: vals)
		{
			System.out.print(val+"\t");
		}
	}
}