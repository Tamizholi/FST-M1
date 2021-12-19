package SelActivity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setAcceptInsecureCerts(true);
//		WebDriver driver=new ChromeDriver(capabilities);
//		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.findElement(By.xpath("//input[contains(@class,'-username') and @placeholder='Username']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@placeholder='Password' and contains(@class,'-password')]")).sendKeys("password");
		driver.findElement(By.xpath("//label[contains(text(),'Confirm Password')]/following-sibling::input[@type='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@type='email' and contains(@class,'email')]")).sendKeys("valid@ymail.com");
		driver.findElement(By.xpath("//button[@class='ui button' and contains(@onclick,'signUp')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("action-confirmation"))));
		String msg=driver.findElement(By.id("action-confirmation")).getText();
		System.out.println(msg);
		driver.close();
		
		
	}

}
