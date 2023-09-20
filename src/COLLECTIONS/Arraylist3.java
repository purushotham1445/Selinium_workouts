package COLLECTIONS;
import java.util.ArrayList;
public class Arraylist3
{
	public static void main(String[] args)
	{
		ArrayList<String> vals = new ArrayList<> ();
		vals.add("Purushotham");
		vals.add("Naresh");
		vals.add("Tharun");
		vals.add("Prathyush");
		vals.add("Sirisha");
		System.out.println(vals);
		vals.add(3,"Naveen");
		System.out.println(vals);
		System.out.println(vals.size());
		System.out.println(vals.contains("Naveen"));
		String x=vals.get(3);
		System.out.println(x);
		vals.add("abc");
		vals.add("123");
		System.out.println(vals);
		vals.remove("123");
		System.out.println(vals);
		vals.add("mno");
		vals.add("123");
		vals.add("mno");
		vals.add("pqr");
		System.out.println(vals);
		while(vals.contains("mno"))
		{
			vals.remove("mno");
		}
		System.out.println(vals);
		vals.set(8,"wxy");
		System.out.println(vals);
		vals.indexOf("123");
		System.out.println(vals.indexOf("123"));
	}
}
