import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectTag 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Atharva/Documents/shreya.html");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.id("a"));
		Select s = new Select(ele);
		//s.selectByValue("125");
		//s.selectByVisibleText("126");
		s.selectByIndex(2);
		
		WebElement ele2 = driver.findElement(By.id("b"));
		Select s1 = new Select(ele2);
		if(s1.isMultiple())
		{
			/*
			s1.selectByValue("322");//select 2 value at a time
			s1.selectByValue("324");//selct 2 value at a time
			*/
			List<WebElement> vals = s1.getOptions();//selecting multivale at a time
			for (WebElement val : vals) 
			{
				s1.selectByValue(val.getText());
				Thread.sleep(1000);
			}
		}
		s1.deselectByIndex(2);//deselect one by value
		Thread.sleep(1000);
		s1.deselectByValue("324");//deselect one by one
		Thread.sleep(1000);
		s1.deselectByVisibleText("321");//deselect one by one
		
		System.out.println(s1.getFirstSelectedOption().getText());//select 1st optins and print in to the cansole
		List<WebElement> spot = s1.getAllSelectedOptions();
		for (WebElement opt : spot) 
		{
			System.out.println(opt.getText());//printing in to the cansole
		}
		s1.deselectAll();//deselect all options
	}
}
