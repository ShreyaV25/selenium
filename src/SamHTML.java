import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SamHTML 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Atharva/Documents/sam1.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='textA']")).sendKeys("name");
		WebDriverWait ww = new WebDriverWait(driver,10);
		ww.until(ExpectedConditions.textToBePresentInElementValue(By.name("textA"), "name"));
		driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("shreya");
	}
}
