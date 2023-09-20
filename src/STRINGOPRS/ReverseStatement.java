package STRINGOPRS;
public class ReverseStatement
{
	public static void main(String[] args)
	{
		String str="Java is Objective oriented programming language";
		String[] vals=str.split(" ");
		String newstr="";
		for(int i=vals.length-1;i>=0;i--)
		{
			String word=vals[i];
			newstr=newstr+" "+word;
		}
		System.out.println(newstr.trim());
	}
}
