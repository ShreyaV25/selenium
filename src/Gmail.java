import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("visputeshreya@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		
	}
}
