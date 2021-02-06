import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		driver.findElement(By.id("promtButton")).click();
	    Thread.sleep(2000);
		Alert a1 = driver.switchTo().alert();
	    a1.sendKeys("shreya");
	    System.out.println(a1.getText());
	    a1.accept();
	    driver.findElement(By.id("timerAlertButton")).click();
	    Thread.sleep(2000);
	    WebDriverWait ww = new WebDriverWait(driver,10);
	    ww.until(ExpectedConditions.alertIsPresent());
	    Alert a2 = driver.switchTo().alert();
	    System.out.println(a2.getText());
	    a2.accept();
	}
}
