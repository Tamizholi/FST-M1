package SelActivity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setAcceptInsecureCerts(true);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get(" https://training-support.net/selenium/dynamic-controls");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		WebElement toggleBtn=driver.findElement(By.id("toggleCheckbox"));
		toggleBtn.click();
		WebElement chckbox=driver.findElement(By.cssSelector("input.willDisappear"));
		wait.until(ExpectedConditions.invisibilityOf(chckbox));
		toggleBtn.click();
		wait.until(ExpectedConditions.visibilityOf(chckbox));
		driver.close();
		
	}

}
