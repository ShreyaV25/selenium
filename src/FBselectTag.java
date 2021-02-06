import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FBselectTag 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement CreateNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		System.out.println(CreateNewAcc.isEnabled());
		if(CreateNewAcc.isEnabled())
			CreateNewAcc.click();
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select sday = new Select(day);
		sday.selectByIndex(24);
		
		WebElement month = driver.findElement(By.id("month"));
		Select sMonth = new Select(month);
		sMonth.selectByValue("12");
		List<WebElement> months = sMonth.getOptions();
		for (WebElement mon : months) 
		{
			System.out.println(mon.getText());
		}
		
		WebElement year = driver.findElement(By.id("year"));
		Select sYear = new Select(year);
		sYear.selectByValue("1994");
		
		Thread.sleep(2000);
		driver.close();
	}
}
