package SelActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setAcceptInsecureCerts(true);
		driver.get(" https://training-support.net/selenium/dynamic-controls");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		WebElement chckbxOTp = driver.findElement(By.cssSelector("div#dynamicText"));
		System.out.println("Checkbox Input :" + chckbxOTp.isDisplayed());
		driver.findElement(By.cssSelector("button#toggleCheckbox")).click();
		WebElement chckbx = driver.findElement(By.cssSelector("div#dynamicCheckbox"));
		System.out.println("Checkbox displayed :" + chckbx.isDisplayed());
		driver.close();
	}

}
