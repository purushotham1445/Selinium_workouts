package Selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class MakeMyTrip_Search_Flights
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://makemytrip.com");
		/*//this code only exceute when add is displayed
		driver.switchTo().frame(1);
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		driver.switchTo().defaultContent();*/
		
		driver.findElement(By.xpath("//span[text()='Travellers & Class']")).click();
		
		driver.findElement(By.xpath("//li[@data-cy='adults-6']")).click();
		
	}
}