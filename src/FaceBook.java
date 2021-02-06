import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//WebElement email = driver.findElement(By.id("email"));
		WebElement email = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
		email.sendKeys("Visputeshreya@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("shreya");
		
		WebElement login = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		login.click();
		
	}
}
