// line 32 x-path for hotels..
package Selinium;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class WorkingwithDateandCalender
{
	public static void main(String[] args)
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		Date dt = new Date();
		
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		c.add(Calendar.DAY_OF_MONTH, 5);
		
		String monthName = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
		int dayNum = c.get(Calendar.DAY_OF_MONTH);
		
		String xpath = "div[text()='"+monthName+"']/ancestor::div[@class='DayPicker-Month']//div[text()='"+dayNum+"']";   // for hotel
		
		System.out.println(xpath);
		String xpathforRightArrow = "";
		
		while(true)
		{
			List<WebElement> dayElem = driver.findElements(By.xpath(xpath));
			if(dayElem.size() == 0)
			{
				driver.findElement(By.xpath(xpathforRightArrow)).click();
			}
			else
			{
				dayElem.get(0).click();
			}
		}
		
		
		
		/*System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH));*/
	}
}