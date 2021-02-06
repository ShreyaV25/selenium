package AssigmentsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GoldCoin20 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
		
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		Actions a = new Actions(driver);
		
		for (WebElement coins : menu) 
		{
			if (coins.getText().equals("COINS")) 
			{
				WebElement coin = driver.findElement(By.xpath("//nav/ul[1]/li[8]"));
				Thread.sleep(2000);
				a.moveToElement(coin).perform();
				driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-20gms,m']")).click();
				WebElement gm20 = driver.findElement(By.xpath("//h1[text()='20 gram 24 KT Gold Coin']"));
				Thread.sleep(2000);
				if(gm20.isDisplayed()) 
				{
					System.out.println(gm20.getText());
				}
				break;
			}
		}
		driver.close();
	}
}
