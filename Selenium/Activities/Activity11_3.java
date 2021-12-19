package SelActivity;

import java.time.Duration;
import java.util.List;

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

public class Activity11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setAcceptInsecureCerts(true);
//		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Page Title " + driver.getTitle());
		
		// Prompt Alert
		WebElement prompt = driver.findElement(By.cssSelector("button#prompt"));
		prompt.click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Prompt Alert " + alert.getText());
		alert.sendKeys("Yes, you are!");
		System.out.println("Prompt Alert " + alert.getText());
		alert.accept();
		
		driver.close();
	}

}
