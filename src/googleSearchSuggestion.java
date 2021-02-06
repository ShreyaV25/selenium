import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleSearchSuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(20000);
		WebElement search = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		search.sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//span[contains(.,'java')]/parent::div"));
		for (WebElement elements : ele) 
		{
			System.out.println(elements.getText());
		}
		ele.get(2).click();
		
		driver.close();
	}
}

