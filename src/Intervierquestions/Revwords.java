package Intervierquestions;
class Revwords
{
	public static void main(String[] args)
	{
		String str = "This is java String";
		String[] allwords = str.split(" ");
		String newstr="";
		for(String word: allwords)
		{
			String revword="";
			for(int i=0;i<=word.length()-1;i++)
			{
				char mychar = word.charAt(i);
				revword= mychar+revword;
			}
			newstr= newstr+" "+revword;
		}
		System.out.println(newstr.trim());
	}
}