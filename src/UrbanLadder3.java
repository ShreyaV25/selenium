import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(20000);
		
	    driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	    List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
	    Actions a = new Actions(driver);
	    Thread.sleep(1000);
	    for (WebElement menuName : menus) 
	    {
	    	String mName = menuName.getText();
	    	System.err.println(mName);
	    	a.moveToElement(menuName).build().perform();
	    	Thread.sleep(2000);
	    	List<WebElement> subMenues = driver.findElements(By.xpath("//span[contains(.,'"+mName+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
		for (WebElement subMenuName : subMenues) 
		{
			System.out.println(subMenuName.getText());
		}
		Thread.sleep(2000);
	    }
	    driver.close();
	}
}

