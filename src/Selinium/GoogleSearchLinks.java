package Selinium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class GoogleSearchLinks
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("IPL", Keys.ENTER);
		
		//driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		
		List<WebElement> allresults = driver.findElements(By.xpath("//div[@class='MjjYud']//h3/parent::a"));
		
		System.out.println(allresults.size());
		for(int i = 0; i <= allresults.size()-1; i++)
		{
			allresults = driver.findElements(By.xpath("//div[@class='MjjYud']//h3/parent::a"));
			if(allresults.get(i).isDisplayed())
			{
				allresults.get(i).click();
				
				String title = driver.getTitle();
				String url = driver.getCurrentUrl();
				
				System.out.println(title+"- - - - - - - - - -"+url);
				Thread.sleep(5000);
				driver.navigate().back();
			}
		}		
	}
}