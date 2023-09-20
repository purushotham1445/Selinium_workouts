package Selinium;

import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithDateAndCalendarMakeMyTrip
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.makemytrip.com/");
		
		
		
		Map<String,String> futureDate = getFutureDayAndMonth(4, DatePart.DAY);
		
		String xpathForDay = "//div[starts-with(text(), '"+futureDate.get("MONTH")+"')]/../..//p[text()='"+futureDate.get("day")+"']";
		/*try
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.pollingEvery(Duration.ofMillis(200));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
		}
		catch(Exception e)
		{
			 System.out.println(e.getMessage());
			 System.exit(0);
		}
		
		
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//a[@class='close']")).click();
		driver.switchTo().defaultContent();*/
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		while(true)
		{
			try
			{
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				wait.pollingEvery(Duration.ofMillis(200));
				WebElement elem = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathForDay)));
				elem.click();
				break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
	}
	public static Map<String,String> getFutureDayAndMonth(int total, DatePart datePartToAdd)
	{
		Date dt = new Date();
		
		Map<String,String> dayParts= new HashMap();
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		
		switch(datePartToAdd)
		{
		case DAY:
			c.add(Calendar.DAY_OF_MONTH, total);
			break;
		case MONTH:
			c.add(Calendar.MONTH, total);
			break;
		case YEAR:
			c.add(Calendar.YEAR, total);
			break;
					
		}
		String monthName = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
		int dayNum = c.get(Calendar.DAY_OF_MONTH);
		
		dayParts.put("day", String.valueOf(dayNum));
		dayParts.put("month", monthName);
		dayParts.put("year", String.valueOf(c.get(Calendar.YEAR)));
		
		String dayAndMonth = dayNum+"- - -"+monthName;
		return dayParts;
	}
}