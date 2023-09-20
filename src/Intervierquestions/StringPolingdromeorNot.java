package Intervierquestions;

class StringPolingdromeorNot
{
	public static void main(String[] args)
	{
		String myString="RADAR";
		StringBuffer buffer=new StringBuffer(myString);
		buffer.reverse();
		String data=buffer.toString();
		if(myString.equals(data))
		{
			System.out.println("The given String "+myString+" is Polindrom");
		}
		else
		{
			System.out.println("The given String "+myString+" is not Polindrom");
		}
	}
}