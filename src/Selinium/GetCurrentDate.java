package Selinium;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class GetCurrentDate
{
	public static void main(String[] args) throws Exception
	{
		Date dt = new Date();
		System.out.println(dt);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String strDate = sdf.format(dt);
		System.out.println(strDate);
		
		/*String dob = "16-05-2023";
		
		Date dt = new Date();
		System.out.println(dt);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date dt1 =sdf.parse(dob);
		System.out.println(dt1);*/
		
	}
} 