package Selinium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class OrangeHRM_Admin_selectUnselectEmployes
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		String dob = "30-Jun-2001"; 
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']/parent::a")).click();
		
		WebElement topLevelCheckBox = driver.findElement(By.xpath("//div[text()='Username']/preceding-sibling::div//input"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].click();", topLevelCheckBox);
		
		int count =0;
		
		List<WebElement> allEmpCheckBoxes = driver.findElements(By.xpath("//i[contains(@class,'bi-check')]/..//preceding-sibling::input"));
		
		for(int i=0;i<=allEmpCheckBoxes.size()-1;i++)
		{
			boolean isCheckBoxSelected = allEmpCheckBoxes.get(i).isSelected();
			if(!isCheckBoxSelected)
			{
				count++;
			}
		}
		System.out.println("Total Unselected: "+count);
		
		
	}
}