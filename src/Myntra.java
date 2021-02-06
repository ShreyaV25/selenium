import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.Myntra.com/");
		Thread.sleep(20000);
		
		List<WebElement> menus = driver.findElements(By.xpath("//header[@class='desktop-container']"));
		Actions a = new Actions(driver);
		for (WebElement menuName : menus) 
		{
			System.out.println(menuName.getText());
			a.moveToElement(menuName).build().perform();
			Thread.sleep(1000);
		}
		driver.close();
	}
}
