import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisableTextHTML 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Atharva/Documents/DisabledText.html");
		
		WebDriverWait ww = new WebDriverWait(driver, 10);
		driver.findElement(By.id("abc")).sendKeys("name");
		
		ww.until(new ExpectedCondition<Boolean>() 
		{
			@Override
			public Boolean apply(WebDriver driver) 
			{
				return !driver.findElement(By.id("xyz")).isEnabled();
			}
		});
		driver.findElement(By.id("pqr")).sendKeys("shreya");
	}
}
