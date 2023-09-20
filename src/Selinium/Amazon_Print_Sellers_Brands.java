package Selinium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class Amazon_Print_Sellers_Brands
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://amazon.in");
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		List <WebElement> allSellers = driver.findElements(By.xpath("//span[text()='Seller']/../..//span[@class='a-size-base a-color-base']"));
		
		for(WebElement elem : allSellers)
		{
			System.out.println(elem.getText());
		}
		
		List <WebElement> allBrands = driver.findElements(By.xpath("//span[text()='Brands']/../..//span[@class='a-size-base a-color-base']"));
		
		for(WebElement elem : allBrands)
		{
			System.out.println(elem.getText());
		}
	}
}