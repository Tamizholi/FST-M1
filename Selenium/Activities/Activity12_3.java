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

public class Activity12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.training-support.net/selenium/popups");
		System.out.println("Page Title " + driver.getTitle());

		WebElement signin=driver.findElement(By.xpath("//button[@data-tooltip='Click to sign in']"));
		Actions actions=new Actions(driver);
		
		 //Hover over button
		actions.moveToElement(signin).pause(Duration.ofSeconds(1)).build().perform();
        String tooltipText = signin.getAttribute("data-tooltip");
        System.out.println("Tooltip text: " + tooltipText);
        
        //Click on the button
        signin.click();
        
        //Wait for modal to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
        
        //Find username and pasword and fill in the details
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
        //Read the login message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(message);
        
	
		driver.close();

	}

}
