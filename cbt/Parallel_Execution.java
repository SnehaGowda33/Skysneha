package cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Execution {
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	void Login(String br) throws InterruptedException
	{
	driver = new ChromeDriver();
	driver = new EdgeDriver();
	driver = new FirefoxDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	
	Thread.sleep(3000);
	WebElement ele=driver.findElement(By.xpath("//input[@name='username']"));
	ele.sendKeys("sneha.cs.gowda");
	WebElement ele1=driver.findElement(By.xpath("//input[@name='password']"));
	ele1.sendKeys("Pappy@33");
	
	WebElement ele2=driver.findElement(By.xpath("//button[@type='submit']"));
	ele2.click();
	}
}
