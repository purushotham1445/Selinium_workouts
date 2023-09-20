package Intervierquestions;
import java.util.HashMap;
import java.util.Map;
class Countcharacter1
{
	public static void main(String[] args)
	{
		String str="this is java string";
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			char mychar =str.charAt(i);
			if(charCount.containsKey(mychar))
			{
				int curval= charCount.get(mychar);
				curval++;
				charCount.put(mychar, curval);
			}
			else
			{
				charCount.put(mychar, 1);
			}
		}
		System.out.println(charCount);
	}
}