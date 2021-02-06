import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sam1HTLM 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Atharva/Documents/sam1.html");
		
		new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) 
			{
				return driver.findElement(By.xpath("//div[1]/input[1]")).getAttribute("name").equals("alia");
			}
		});
		driver.findElement(By.name("textA")).sendKeys("shreya");
	}
}
