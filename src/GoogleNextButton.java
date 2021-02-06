import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleNextButton 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java",Keys.ENTER);
		
		Thread.sleep(2000);
		
		boolean next = driver.findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed();
		while(next)
		{
			WebElement nextt = driver.findElement(By.xpath("(//span[contains(text(),'Next')])//parent::a"));
			nextt.click();
			//next = driver.findElement(By.xpath("(//span[contains(text(),'Next')])//parent::a"));
		}
		
		//driver.close();
	}
}
