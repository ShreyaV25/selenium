import java.io.IOException;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpLoadPPOPUP 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		driver.findElement(By.id("file_wraper0")).click();
		
		Runtime r = Runtime.getRuntime();
		Thread.sleep(2000);
		String st = "D:\\SHREYA\\\\UpLoadDemo.exe";
		r.exec(st);
		
	}
}
