import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UrbanLadder 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(40000);
		
	    driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	    
	    //WebElement sale= driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/span[@class='topnav_itemname']"));
	    
	   	driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys("sofa");
	    driver.findElement(By.xpath("//button[@id='search_button']")).click();
	    driver.findElement(By.xpath("//img[@alt='Weston Half Leather Sofa (Camel Italian Leather)']")).click();
	    //driver.findElement(By.xpath("//img[@alt='Chocolate Italian Leather']")).click();
	    
	    WebElement sale = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
	    //sale.click();
	   	System.out.println(sale.getText()); 
	   
	}    
	   
}
