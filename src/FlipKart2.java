import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FlipKart2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		List<WebElement> menus = driver.findElements(By.xpath("//div[@class='_1kidPb']/span"));
		Thread.sleep(2000);
		Actions a =  new Actions(driver);
		for (WebElement menusName : menus) 
		{
			String mName = menusName.getText();
			System.err.println(mName);
			a.moveToElement(menusName).build().perform();
			Thread.sleep(1000);
			List<WebElement> submenus = driver.findElements(By.xpath("//span[contains(.,'"+mName+"')]/parent::div"));
			for (WebElement submenu : submenus) 
			{
				System.out.println(submenu.getText());
			}
			Thread.sleep(2000);
		}
		driver.close();
	}
}
