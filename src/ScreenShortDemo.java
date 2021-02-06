import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class ScreenShortDemo 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;//casting driver to TakeScreenShot interface
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File screenshortSave = new File("./Screenshot/google.png");//save in folder
		Files.copy(screenshot, screenshortSave);
	}
}
