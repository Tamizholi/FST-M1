package SelActivity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setAcceptInsecureCerts(true);
//		WebDriver driver=new ChromeDriver(capabilities);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.training-support.net/selenium/ajax");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.findElement(By.xpath("//button[@class='ui violet button']")).click();
		// Wait for text to load
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));

		// getText() and print it
		String ajaxText = driver.findElement(By.id("ajax-content")).getText();
		System.out.println(ajaxText);

		// Wait for late text
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));

		// Get late text and print it
		String lateText = driver.findElement(By.id("ajax-content")).getText();
		System.out.println(lateText);
		driver.close();
	}

}
