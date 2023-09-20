package COLLECTIONS;
import java.util.TreeSet;
public class Treeset
{
	public static void main(String[] args)
	{
		TreeSet<String> vals = new TreeSet<> ();
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
