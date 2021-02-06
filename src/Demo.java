import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SetAlertText;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();  //maximize window
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		/*
		Set<String>set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		for (String s : set) 
		{
			System.out.println(s);
		}
		
		set.remove("b");
		System.out.println("---------------------");
		
		for(String s: set)
		{
			System.out.println(s);
		}
		*/
	}
}
