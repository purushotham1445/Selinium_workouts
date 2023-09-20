package Intervierquestions;
class Sumdigits
{
	public static void main(String[] args)
	{
		String str="This99 is23 java234 String123";
		int num=0;
		for(int i=0; i<=str.length()-1;i++)
		{
			char mychar = str.charAt(i);
			if(mychar >= 48 && mychar <= 57)
			{
				num = num +Integer.parseInt(String.valueOf(mychar));
			}
			
		}
		System.out.println(num);
	}
}