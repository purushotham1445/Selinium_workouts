package Selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class GmailLogin
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("purushothamtest123@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(2000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("purushotham123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='agP aFw']")));
		driver.findElement(By.xpath("//input[@class='agP aFw']")).sendKeys("a.purushothamreddy438@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Hi Good Morning");
	}
}