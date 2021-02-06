import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class jqueryuiD 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		WebElement f = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		Thread.sleep(10000);
		
		driver.switchTo().frame(f);
		WebElement e = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement e1 =driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(e, e1).build().perform();
		Thread.sleep(1000);
		WebElement user = driver.findElement(By.xpath("//p[text()='Dropped!']"));
		System.out.println(user.getText());
		driver.close();
	}
}
