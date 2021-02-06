import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDemo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//span[contains(.,'Back to top')]")).click();//scrolling down without javaScript
		
		JavascriptExecutor js = (JavascriptExecutor)driver;//javaScript exeutor have be cast to webDriver object
		/*
		js.executeScript("window.scrollBy(0,1000)");//scroll down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");//scroll up
		*/
		
		/*
		js.executeScript("window.scrollBy(300,0)");//scroll right
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-200,0)");//scroll left
		*/
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//scroll full down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//scroll full up
		
		WebElement sfh = driver.findElement(By.xpath("//h2[contains(.,'Stand for Handmade')"));
		js.executeScript("arguments[0].scrollIntoView()", sfh);//scroll till WebElement

	}
}
