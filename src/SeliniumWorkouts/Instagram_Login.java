package SeliniumWorkouts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class Instagram_Login
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8317546554");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Reddy265@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		
		
	}
}