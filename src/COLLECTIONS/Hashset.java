package COLLECTIONS;

import java.util.HashSet;

public class Hashset
{
	public static void main(String[] args)
	{
		HashSet<String> vals = new HashSet<> ();
		vals.add("abc");
		vals.add("123");
		vals.add("mno");
		vals.add("pqr");
		vals.add("abc");
		vals.add("123");
		vals.add("database");
		System.out.println(vals);
	}
}
