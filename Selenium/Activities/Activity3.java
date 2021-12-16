package SelActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new ChromeDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setAcceptInsecureCerts(true);
		driver.get("https://www.training-support.net/selenium/simple-form");
		System.out.println("Title of the page is " + driver.getTitle());
		driver.findElement(By.id("firstName")).sendKeys("FirstName");
		driver.findElement(By.id("lastName")).sendKeys("LastName");
		driver.findElement(By.id("email")).sendKeys("EmailId");
		driver.findElement(By.id("number")).sendKeys("LastName");
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();

	}

}
