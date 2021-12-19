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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setAcceptInsecureCerts(true);
//		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.training-support.net/selenium/drag-drop");
		System.out.println("Page Title " + driver.getTitle());
		Actions actions = new Actions(driver);
		WebElement ball = driver.findElement(By.id("draggable"));
		WebElement dropzone1 = driver.findElement(By.id("droppable"));
		WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
		// Dropzone1
		actions.click(ball).build().perform();
		actions.dragAndDrop(ball, dropzone1).build().perform();
		wait.until(ExpectedConditions
				.textToBePresentInElement(driver.findElement(By.xpath("//div[@id='droppable']//p")), "Dropped!"));
		actions.dragAndDrop(dropzone1, dropzone2).build().perform();
		wait.until(ExpectedConditions
				.textToBePresentInElement(driver.findElement(By.xpath("//div[@id='dropzone2']//p")), "Dropped!"));
		driver.close();
	}

}
