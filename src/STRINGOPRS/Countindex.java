package STRINGOPRS;
class Countindex
{
	public static void main(String[] args)
	{
		String str="Java is objective Oriented Programming";
		int total=0;
		int pos=str.indexOf("Java");
		while(pos != -1)
		{
			total++;
			pos=str.indexOf("Programming", pos+1);
		}
		System.out.println(total);
	}
}
