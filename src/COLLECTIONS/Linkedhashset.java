package COLLECTIONS;
import java.util.LinkedHashSet;
public class Linkedhashset
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> vals = new LinkedHashSet<> ();
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
