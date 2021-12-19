package SelActivity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setAcceptInsecureCerts(true);
//		WebDriver driver = new ChromeDriver(capabilities);
//		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.training-support.net/selenium/tables");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		List<WebElement> rows = driver.findElements(By.xpath("//table[(@id='sortableTable')]/tbody/tr"));
		System.out.println("No.of rows " + rows.size());
		List<WebElement> columns = driver.findElements(By.xpath("//table[(@id='sortableTable')]/tbody/tr/td"));
		System.out.println("No.of columns " + columns.size());

		WebElement secondrow = driver.findElement(By.xpath("//table[(@id='sortableTable')]/tbody/tr[2]/td[2]"));
		System.out.println(secondrow.getText());
		
		driver.findElement(By.xpath("//table[(@id='sortableTable')]/thead/tr/th[1]")).click();
		
		WebElement secondrowAgain = driver.findElement(By.xpath("//table[(@id='sortableTable')]/tbody/tr[2]/td[2]"));driver.findElement(By.xpath("//table[(@id='sortableTable')]/thead/tr/th[1]")).click();
		System.out.println(secondrowAgain.getText());

		List<WebElement> tfoot = driver.findElements(By.xpath("//table[(@id='sortableTable')]/tfoot/tr/th"));
		for (WebElement footlist : tfoot) {
			System.out.println(footlist.getText());
		}

		driver.close();
	}

}
