package testNGLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Rediff {

	WebDriver driver;
	@Test(description="Launch Chrome",priority=1)
	public void openBrowser()
	{
		System.out.println("Launch Browser");
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		
	}
	@Test(description="Login-HardAssert",priority=2)
	public void login()
	{
		
		System.out.println("Login...");
		String title=driver.getTitle();
		System.out.println("Title="+title);
		Assert.assertEquals(title, "Rediffmail123");
		System.out.println("Assert Executed..");	
		driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
		driver.findElement(By.id("password")).sendKeys("arpana123");
		driver.findElement(By.name("remember")).click();
		driver.findElement(By.name("proceed")).click();
		
		driver.findElement(By.linkText("Logout")).click();
	}
	@Test(description="Close Rediff",priority=3)
	public void closeBrowser()
	{
		System.out.println("Close Browser");
		driver.quit();
	}
}
