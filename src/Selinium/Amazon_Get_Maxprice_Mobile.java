package Selinium;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class Amazon_Get_Maxprice_Mobile
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		String[] allBrands = {"Samsung", "Apple","realme","Oppo"};
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://amazon.in");
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		selectBrands(allBrands);
		double maxPrice = getMaxprice();
		
		System.out.println(maxPrice);
	}
	public static double getMaxprice()
	{
		double maxPrice = 0;
		
		do {
			List<WebElement> allelements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
			for(WebElement priceElements: allelements)
			{
				String productPrice = priceElements.getText();
				productPrice = productPrice.replace(",", "");
				double dblprice = Double.parseDouble(productPrice);
				
				if(dblprice < 20000.0)
				{
					JavascriptExecutor js =(JavascriptExecutor) driver;
					js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');",priceElements);
				}
				System.out.println(dblprice);
				if(dblprice > maxPrice)
				{
					maxPrice = dblprice;
				}
			}
			try {
			JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//a[text()='Next']")));
			} catch(NoSuchElementException e) {
				
			}
			if(driver.findElements(By.xpath("//a[text()='Next']")).size() == 0)
				break;
			else
				driver.findElements(By.xpath("//a[text()='Next']")).get(0).click();
			
		} while (true);
		return maxPrice;
	}
	public static void selectBrands(String[] allBrands)
	{
		for(String brandName: allBrands) 
		{
			try
			{
				WebElement brandCheckbox = driver.findElement(By.xpath("//span[text()='Brands']/../following-sibling::ul//a//span[text()='"+brandName+"']/preceding-sibling::div//input"));
				
				JavascriptExecutor js =(JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", brandCheckbox);
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Brand: "+brandName+" is not Available.");
			}
		}
	}
}