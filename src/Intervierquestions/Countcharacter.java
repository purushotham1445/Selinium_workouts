package Intervierquestions;
class Countcharacter
{
	public static void main(String[] args)
	{
		String str="this is java string";
		while(!str.isEmpty())
		{
			int l1=str.length();
			String firstchar=str.substring(0,1);
			str=str.replace(firstchar, "");
			int l2=str.length();
			System.out.print(firstchar+"-"+(l1-l2)+"  ");
		}
	}
}