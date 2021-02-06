import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook2 
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
		WebElement female = driver.findElement(By.xpath("//label[text()='Female']"));
		if(female.isDisplayed())
			female.click();
		Thread.sleep(2000);
		System.out.println(female.isSelected());
		System.out.println(female.getCssValue("font-size"));
		System.out.println(female.getCssValue("background-color"));
		System.out.println(female.getRect().getPoint());
		Point loc = female.getLocation();
		System.out.println("X: "+loc.getX()+ " Y: " +loc.getY());
	}
}
