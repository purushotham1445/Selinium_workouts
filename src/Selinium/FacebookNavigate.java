package Selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

class FacebookNavigate
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		String dob = "30-Jun-2001"; 
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0')]")).click();
		
		enteruserinfo("abcd", "wxyz","test@test.com", "1234", dob, "Male");
	}
	public static void selectgender(String gender)
	{
		switch(gender)
		{
		case "Male":
			driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();
			break;
		case "Female":
			driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
			break;
		default:
			driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input")).click();
			break;
				
		}
	}
	public static void enteruserinfo(String firstname, String lastname, String email, String password, String dob, String gender)
	{
		driver.findElement(By.xpath("//input[starts-with(@id,'u_2_b')]")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[starts-with(@id,'u_2_d')]")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[starts-with(@id,'u_2_g')]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys(password);
		
		String[] datevals = dob.split("-");
		 
		selectvaluefromList(By.id("day"), datevals[0]);
		selectvaluefromList(By.id("month"), datevals[1]);
		selectvaluefromList(By.id("year"), datevals[2]);
		selectgender(gender);
	}
	public static  void selectvaluefromList(By by, String selectvalue)
	{
		WebElement List = driver.findElement(by);
		Select list = new Select(List);
		list.selectByVisibleText(selectvalue);
	}
}