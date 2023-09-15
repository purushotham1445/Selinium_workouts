package Examsolutions;

class Anagramsornot
{
	public static void main(String[] args)
	{
		String str1 = "Abcde";
		String str2 = "edcba";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length() != str2.length())
		{
			System.out.println("Not Anagrams");
		}
		else
		{
			boolean b = true;
			while(!(str1.isEmpty() || str2.isEmpty()))
			{
				String firstchar = str1.substring(0,1);
				str1 = str1.replace(firstchar, "");
				str2 = str2.replace(firstchar, "");
				if(str1.length() != str2.length())
				{
					b = false;
					break;
				}
			}
			if(b)
			{
				System.out.println("Anagrams");
			}
			else
			{
				System.out.println("Not Anagrams");
			}
		}
	}
}