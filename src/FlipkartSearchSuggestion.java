import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartSearchSuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphone");
		Thread.sleep(2000);
		
		List<WebElement> ele = driver.findElements(By.xpath("//span[contains(.,'iphone')]/parent::div"));
		Thread.sleep(2000);
		for (WebElement Element : ele) 
		{
			System.out.println(Element.getText());
		}
		ele.get(1).click();
		
	}
}
