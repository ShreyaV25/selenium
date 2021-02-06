package AssigmentsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneRing10000
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
		
		WebElement search = driver.findElement(By.id("search_query_top_elastic_search"));
		search.sendKeys("ring",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> price = driver.findElements(By.xpath("//span[contains(.,'Price')]/span"));
		Actions a = new Actions(driver);
		for (WebElement ele : price) 
		{
			Thread.sleep(2000);
			a.moveToElement(ele).perform();
			WebElement rings = driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']"));
		}
		//WebElement rings = driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']"));
		
		driver.close();
	}
}
