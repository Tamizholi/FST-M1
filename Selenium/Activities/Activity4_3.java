package SelActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setAcceptInsecureCerts(true);
		driver.get("https://www.training-support.net/selenium/target-practice");
		System.out.println("Title of the page is " + driver.getTitle());
		System.out.println("Third Header" + driver.findElement(By.xpath("//h3")).getText());
		WebElement headerfive = driver.findElement(By.xpath("//h5"));
		String color = headerfive.findElement(By.cssSelector("color")).getText();
		System.out.println("Fifth Header color" + color);
		String violetClasses = driver.findElement(By.cssSelector("button.ui violet button")).getAttribute("class");
		System.out.println("Violet Button Classes " + violetClasses);
		String greyBtn = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"))
				.getText();
		System.out.println("Grey Button " + greyBtn);
		driver.close();
	}

}
