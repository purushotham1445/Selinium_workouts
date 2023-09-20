package Intervierquestions;
import java.util.Stack;
class Stringisbuiltproperlyornot
{
	public static void main(String[] args)
	{
		String str="{[(<>{})]<({()})>}";
		Stack<Character> openChars = new Stack<>();
		char[] allChars = str.toCharArray();
		for(char myChar: allChars)
		{
			if(myChar == '{' || myChar == '[' || myChar == '(' || myChar =='<')
			{
				openChars.add(myChar);
			}
			else
			{
				boolean ismatched = true;
				char lastChar = openChars.pop();
				switch(myChar)
				{
					case '}':
						if(lastChar != '{')
						{
							ismatched = false;
						}
						break;
					case ']':
						if(lastChar != '[')
						{
							ismatched = false;
						}
						break;
					case ')':
						if(lastChar != '(')
						{
							ismatched = false;
						}
						break;
					case '>':
						if(lastChar != '<')
						{
							ismatched = false;
						}
						break;
				}
				if(ismatched == false)
				{
					System.out.println(lastChar+"::"+myChar+"not matched");
				}
			}
		}
		if(!openChars.empty())
		{
			System.out.println("Some open brackets are not closed:"+ openChars);
		}
		else
		{
			System.out.println("String is built Properly");
		}
	}
}