package STRINGOPRS;
class Revwordinstatement
{
	public static void main(String[] args)
	{
		String str="xyz abcd 123 purushotham";
		String[] vals=str.split(" ");
		String newstr="";
		for(String word: vals)
		{
			if(word.length() > 3)
			{
				String revword="";
				for(int i=word.length()-1;i>=0;i--)
				{
					char mychar=word.charAt(i);
					revword=revword+mychar;
				}
				newstr=newstr+" "+revword;
			}
			else
			{
				newstr=newstr+" "+word;
			}
		}
		System.out.println(newstr);
	}
}
