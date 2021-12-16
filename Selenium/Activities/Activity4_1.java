package SelActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Activity4_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setAcceptInsecureCerts(true);
		driver.get("https://www.training-support.net/");
		System.out.println("Title of the page is " + driver.getTitle());
		driver.findElement(By.xpath("//a[@id='about-link']")).click();
		System.out.println("Title of the page is " + driver.getTitle());
		driver.close();
	}
}
