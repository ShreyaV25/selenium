import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonClick 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Atharva/Documents/ButtonClick.html");
		
		WebDriverWait ww = new WebDriverWait(driver,10);
		ww.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("otherBtn"))));
		driver.findElement(By.id("otherBtn")).click();
		
		ww.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("sBtn"))));
		driver.findElement(By.id("sBtn")).click();
	}
}
