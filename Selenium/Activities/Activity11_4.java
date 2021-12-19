package SelActivity;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setAcceptInsecureCerts(true);
//		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.training-support.net/selenium/tab-opener");
		System.out.println("Page Title " + driver.getTitle());
		
		//parent window
		String parent=driver.getWindowHandle();
		
		// Click tab
		WebElement clicktb = driver.findElement(By.id("launcher"));
		clicktb.click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		//allwindows
		Set<String> allwindows=driver.getWindowHandles();
		
		for (String handle : allwindows) {
			driver.switchTo().window(handle);
		}
		System.out.println("Current window "+driver.getWindowHandle());
		System.out.println("Page URL " + driver.getCurrentUrl());
		System.out.println(driver.findElement(By.xpath("//div[@class='sub header']")).getText());
		WebElement anothertab = driver.findElement(By.id("actionButton"));
		anothertab.click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		wait.until(ExpectedConditions.titleIs("Newtab2"));
		System.out.println("Another window "+driver.getWindowHandle());
		System.out.println("Another window title "+driver.getTitle());
		System.out.println("Page URL " + driver.getCurrentUrl());
		System.out.println(driver.findElement(By.xpath("//div[@class='sub header']")).getText());
		
		driver.quit();
	}

}
