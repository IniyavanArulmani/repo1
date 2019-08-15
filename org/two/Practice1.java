package org.two;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SASIANAND\\eclipse-workspace\\SeleniumDayTwo\\drivers\\chromedriver_new.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement d = driver.findElement(By.xpath("//frame[@src='RSLogin.html?v=11']"));
	driver.switchTo().frame(d);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']")).click();
	Alert a=driver.switchTo().alert();
	a.accept();
}
}
