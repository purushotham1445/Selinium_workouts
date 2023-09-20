package STRINGOPRS;
class Padylogin
{
	public static void main(String[] args)
	{
		String str="Java is objective oriented programming language";
		String newstr="";
		int pos=-1;
		for(int i=0;i<str.length()-1;i++)
		{
			char mychar=str.charAt(i);
			if(mychar == 'a' || mychar == 'e' || mychar == 'i' || mychar == 'o' || mychar == 'u')
			{
				pos=i;
				break;
			}
		}
		if(pos>=0)
		{
			String leftstr=str.substring(0,pos);
			String rightstr=str.substring(pos);
			newstr=rightstr+leftstr+"ay";
		}
		else
		{
			newstr=str+"ay";
		}
		System.out.println(newstr);
	}
}
