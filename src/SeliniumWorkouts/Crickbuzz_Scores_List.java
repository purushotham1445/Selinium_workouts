package SeliniumWorkouts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class Crickbuzz_Scores_List
{
	public static void main(String[] args)
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.cricbuzz.com");
		
		List<WebElement> allmatches = driver.findElements(By.xpath("//div[@pagename='homepage']//..//ul//..//li//..//a[contains(@title,'Match')]"));
		
		WebElement viewall = driver.findElement(By.xpath("//img[@gtm-title='View All']"));
		if(viewall.isDisplayed())
		{
			viewall.click();
		}
		
		for(WebElement ele: allmatches)
		{
			String text = ele.getText();
			if(text.contains("20") && text.contains("won by"))
			{
				System.out.println(text);
			}
		}
	}
}