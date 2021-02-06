import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenShorUrbanLadder 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a = new Actions(driver);
		for (WebElement menuName : menus) 
		{
			String mName = menuName.getText();
			a.moveToElement(menuName).build().perform();
			Thread.sleep(2000);
			ScreenShotDemo1.ScreenShot(driver,mName);
			List <WebElement> submenu = driver.findElements(By.xpath("//span[contains(.,'"+mName+"')]/parent::li//descendant::ul[@class='taxonslist']"));
			for (WebElement submenus : submenu) 
			{
				System.out.println(submenus.getText());
			}
		}
	}
}
