package org.two;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassOne {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SASIANAND\\eclipse-workspace\\SeleniumDayTwo\\drivers\\chromedriver_new.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("iphones 6");
	driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
	driver.findElement(By.xpath("//img[@title='Apple iPhone 6s ( 32GB , 2 GB ) Rose Gold']")).click();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	String par = driver.getWindowHandle();
	Set<String> all = driver.getWindowHandles();
	for(String x:all) {
	if (!par.equals(all)) {
		driver.switchTo().window(x);
	}
	}
	driver.findElement(By.xpath("//div[@id='add-cart-button-id']")).click();
	String s = driver.findElement(By.xpath("(//span[@class='price'])[2]")).getText();
	System.out.println("the price is "+s);
	driver.quit();
	}
}

