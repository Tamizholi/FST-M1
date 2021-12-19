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

public class Activity12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.training-support.net/selenium/iframes");
		System.out.println("Page Title " + driver.getTitle());

		// Frame 1
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//div[@class='content']")).getText());
		WebElement btn1 = driver.findElement(By.cssSelector("button"));
		System.out.println(btn1.getText());
		System.out.println(btn1.getCssValue("background-color"));
		btn1.click();
		System.out.println(btn1.getText());
		System.out.println(btn1.getCssValue("background-color"));
		// defaultFrame
		driver.switchTo().defaultContent();

		// Frame 2
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//div[@class='content']")).getText());
		WebElement btn2 = driver.findElement(By.cssSelector("button"));
		System.out.println(btn2.getText());
		System.out.println(btn2.getCssValue("background-color"));
		btn2.click();
		System.out.println(btn2.getText());
		System.out.println(btn2.getCssValue("background-color"));
		// defaultFrame
		driver.switchTo().defaultContent();
	
		driver.close();

	}

}
