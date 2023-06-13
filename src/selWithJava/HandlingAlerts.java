package selWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");;
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().sendKeys("george smith");
		String alrtMsg=driver.switchTo().alert().getText();
		System.out.println("Alert Message="+alrtMsg);
		driver.switchTo().alert().accept();
		driver.quit();
		
		
		
	}

}
