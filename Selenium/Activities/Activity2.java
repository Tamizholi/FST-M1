package SelActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setAcceptInsecureCerts(true);
		driver.get("https://www.training-support.net/");
		System.out.println("Title of the page is " + driver.getTitle());
		String usingID = driver.findElement(By.id("about-link")).getText();
		System.out.println("Using Id locator " + usingID);
		
		String usinglinkText = driver.findElement(By.linkText("About Us")).getText();
		System.out.println("Using linkText locator " + usinglinkText);
		String usingcssSelector = driver.findElement(By.cssSelector("a#about-link")).getText();
		System.out.println("Using cssSelector locator " + usingcssSelector);
		String usingClassName = driver.findElement(By.className("green")).getText();
		System.out.println("Using ClassName locator " + usingClassName);
		driver.close();
	}

}
