package Selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OrangeHrm_StaleElementException
{
	public static void main(String[] args)
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		driver.navigate().refresh();
		
		//Way - 1
		boolean isStaled = ExpectedConditions.stalenessOf(userName).apply(driver);
		System.out.println(isStaled);
		
		if(isStaled)
		{
			userName = driver.findElement(By.xpath("//input[@name='username']"));
		}
		userName.sendKeys("abc");
		
		//Way - 2
		/*try
		{
			userName.sendKeys("abc");
		}
		catch(StaleElementReferenceException e)
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc");
		}*/
	}
}