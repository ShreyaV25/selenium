import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHQ 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(10000);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='gsc-i-id1']"));
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		search.sendKeys("testng",Keys.ENTER);
	}
}
//.StaleElementReferenceException this exception get genrated thats why we use POm class