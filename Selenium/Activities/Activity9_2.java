package SelActivity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setAcceptInsecureCerts(true);
//		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.training-support.net/selenium/selects");
		Select sc = new Select(driver.findElement(By.id("multi-select")));
		WebElement val=driver.findElement(By.id("multi-value"));
		if (sc.isMultiple()) {
			sc.selectByVisibleText("Javascript");
			System.out.println(val.getText());
			sc.selectByValue("node");
			System.out.println(val.getText());
			sc.selectByIndex(4);
			System.out.println(val.getText());
			sc.selectByIndex(5);
			System.out.println(val.getText());
			sc.selectByIndex(6);
			System.out.println(val.getText());
			sc.deselectByValue("node");
			System.out.println(val.getText());
			sc.deselectByIndex(7);
			System.out.println(val.getText());
			System.out.println("First Selected Option is " + sc.getFirstSelectedOption().getText());
			List<WebElement> options = sc.getAllSelectedOptions();
			for (WebElement opt : options) {
				System.out.println(opt.getText());
			}
			sc.deselectAll();
		}
		driver.close();
	}

}
