package SeliniumWorkouts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

class OrangeHrmlive
{
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException
	{
		String browser ="chrome";
		launchingbrowser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		login("Admin", "admin123");
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.name("firstName")).sendKeys("Test");
		driver.findElement(By.name("lastName")).sendKeys("User");
		driver.findElement(By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div/input")).sendKeys("12345");
		Thread.sleep(5000);
		driver.quit();
	}
	public static void login(String username, String password)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.tagName("button")).click();
	}
	public static void launchingbrowser(String browser, String url)
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
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}