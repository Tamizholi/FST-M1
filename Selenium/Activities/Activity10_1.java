package SelActivity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setAcceptInsecureCerts(true);
//		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Page Title " + driver.getTitle());
		Actions actions = new Actions(driver);
		WebElement cube = driver.findElement(By.id("wrapD3Cube"));

		// Left click
		actions.click(cube);
		WebElement cubeVal = driver.findElement(By.className("active"));
		System.out.println("Left Click: " + cubeVal.getText());

		// Double click
		actions.doubleClick(cube).perform();
		cubeVal = driver.findElement(By.className("active"));
		System.out.println("Double Click: " + cubeVal.getText());

		// Right click
		actions.contextClick(cube).perform();
		cubeVal = driver.findElement(By.className("active"));
		System.out.println("Right Click: " + cubeVal.getText());

		driver.close();
	}

}
