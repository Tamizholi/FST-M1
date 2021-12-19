package SelActivity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setAcceptInsecureCerts(true);
//		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.training-support.net/selenium/selects");
		WebElement val = driver.findElement(By.id("single-value"));
		WebElement dropdown = driver.findElement(By.id("single-select"));
		Select sc = new Select(dropdown);

		sc.selectByVisibleText("Option 2");
//		wait.until(ExpectedConditions.textToBePresentInElementValue(driver.findElement(By.id("single-value")), "You have selected: Option 2"));
//		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("single-value")), "You have selected: Option 2"));
		System.out.println(driver.findElement(By.id("single-value")).getText());
		sc.selectByIndex(3);
//		wait.until(ExpectedConditions.textToBePresentInElement(val, "You have selected: Option 3"));
		System.out.println(driver.findElement(By.id("single-value")).getText());
		sc.selectByValue("4");
//		wait.until(ExpectedConditions.textToBePresentInElement(val, "You have selected: Option 4"));
		System.out.println(driver.findElement(By.id("single-value")).getText());
		List<WebElement> options = sc.getOptions();
		for (WebElement opt : options) {
			System.out.println(opt.getText());
		}
		
		
		driver.close();
	}

}
