package COLLECTIONS;

import java.util.ArrayList;

public class Arraylist2
{
	public static void main(String[] args)
	{
		ArrayList<String> vals = new ArrayList<>();
		vals.add("C");
		vals.add("dbms");
		vals.add("os");
		vals.add("coa");
		vals.add("cn");
		vals.add("dsgt");
		System.out.println(vals);
		vals.add(2,"dbms lab");
		System.out.println(vals);
		String x=vals.get(3);
		System.out.println(x);
		System.out.println(vals.size());
		vals.add("123");
		vals.add("xyz");
		vals.add("123");
		vals.add("xyz");
		System.out.println(vals);
		vals.remove("xyz");
		System.out.println(vals);
		System.out.println(vals.contains("xyz"));
		while(vals.contains("123"))
		{
			vals.remove("123");
		}
		System.out.println(vals);
		vals.set(7, "c lab");
		System.out.println(vals);
		System.out.println(vals.indexOf("os"));
	}
}
