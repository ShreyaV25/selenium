import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(20000);
		
		WebElement search = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		search.sendKeys("java",Keys.ENTER);
		
		Thread.sleep(2000);
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println(driver.findElement(By.name("q")).getAttribute("aria-label"));
		System.out.println(driver.findElement(By.tagName("title")).getAttribute("textContext"));
		System.out.println(links.size());
		for (WebElement link : links) 
		{
			if(link.getText() !=" ")
			System.out.println(link.getText());
		}
		driver.close();
	}
}
