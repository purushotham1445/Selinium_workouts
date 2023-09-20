package STRINGOPRS;
class Countchar
{
	public static void main(String[] args)
	{
		String str="Purushotham Reddy";
		while(!str.isEmpty())
		{
			int l1=str.length();
			String firstchar=str.substring(0,1);
			str=str.replace(firstchar, "");
			int l2=str.length();
			System.out.println(firstchar+"-->"+(l1-l2));	
		}
	}
}