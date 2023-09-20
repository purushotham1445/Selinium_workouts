package Selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NavigateUrl
{
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException
	{
		String browser = "chrome";
		launchBrowser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(5000);
		WebElement element = driver.findElement(By.name("username"));
		element.sendKeys("abc");
		WebElement pwdField = driver.findElement(By.name("password"));
		pwdField.sendKeys("purushotham");
		WebElement loginbutton = driver.findElement(By.tagName("button"));
		loginbutton.click();
	}
	public static void launchBrowser(String browser, String url)
	{
		switch(browser)
		{
		case "chrome":
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(option);
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			driver = new EdgeDriver();
			break;
		}
		driver.get(url);
		driver.manage().window().maximize();	// for output in fullscreen
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}