package STRINGOPRS;
class Removenumbers
{
	public static void main(String[] args)
	{
		String str="java123 is Objective987 oriented438 programming0002 language";
		str=str.replaceAll("[0-9]", "");
		System.out.println(str);
	}
}
