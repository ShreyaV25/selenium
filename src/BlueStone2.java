import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(20000);
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='bottom-header']"));
		Actions a = new Actions(driver);
		for (WebElement webElements : ele) 
		{
			a.moveToElement(webElements).build().perform();
			Thread.sleep(2000);
		}
	}
}
