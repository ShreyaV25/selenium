package AssigmentsSelenium;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartCBook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//login popup
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("c# book",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		
	    WebElement maxrate = driver.findElement(By.xpath("//div[contains(text(),'4.6')]"));
	    
		Thread.sleep(2000);
		
		
	}
}
