import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(20000);
		
		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(new ExpectedCondition<Boolean>() 
		{
			@Override
			public Boolean apply(WebDriver driver) 
			{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				System.out.println(js.executeScript("return document.readyState").toString());
				boolean pgl = js.executeScript("return document.readyState").toString().equals("complete");
				return pgl;
			}
		});
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(.,'Login ')]/parent::a/parent::td[@id='loginButtonContainer']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[@id='addTaskButtonId']")).click();
		Thread.sleep(4000);
	}
}
