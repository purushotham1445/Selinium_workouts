package COLLECTIONS;
import java.util.ArrayList;
public class Arraylist
{
	public static void main(String[] args)
	{
		ArrayList<String> vals = new ArrayList<>();
		vals.add("Naresh");
		vals.add("Tharun");
		vals.add("Prathyusha");
		vals.add("Sirisha");
		vals.add("Naveen");
		System.out.println(vals);
		String x=vals.get(3);
		System.out.println(x);
		System.out.println(vals.size());
		vals.add(3,"Likitha");
		System.out.println(vals);
		vals.add("abc");
		vals.add("xyz");
		vals.add("123");
		vals.add("xyz");
		vals.add("abc");
		vals.add("123");
		vals.add("apr");
		vals.add("123");
		System.out.println(vals);
		vals.remove("xyz");
		System.out.println(vals);
		System.out.println(vals.contains("123"));
		System.out.println(vals.contains("jks"));
		while(vals.contains("123"))
		{
			vals.remove("123");
		}
		System.out.println(vals);
		vals.set(8,"ap");
		System.out.println(vals);
		System.out.println(vals.indexOf("ap"));


	}
}
