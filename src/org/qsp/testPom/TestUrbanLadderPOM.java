package org.qsp.testPom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.qsp.pom.UrbanLadderPom;

public class TestUrbanLadderPOM 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		UrbanLadderPom ul = new UrbanLadderPom(driver);
		Thread.sleep(3000);
		ul.closeClick();
		Thread.sleep(3000);
		ul.saleMouseHover(driver);
		Thread.sleep(3000);
		ul.sofaClick();
		Thread.sleep(3000);
		ul.viewProductClick();
	}
}
