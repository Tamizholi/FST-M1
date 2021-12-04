package FST.Sel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CRMProject {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "E:\\FST_Workspace\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/crm");

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@Test 
	public void TC1() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "SuiteCRM", "Title doesn't match");
		System.out.println("Title Verified Successfully");

	}

	@Test
	public void TC2() {
		WebElement imgSrc = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
		System.out.println("URL of the header image is " +imgSrc.getAttribute("src") );
	}

	@Test
//Get the copyright text
	public void TC3() {
		String copyRights = driver.findElement(By.id("admin_options")).getText();
		System.out.println("CopyRights of CRM Site is " + copyRights);
	}

	@Test
//Logging into the site
	public void TC4() {
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.name("Login")).click();
		WebElement homePage = driver.findElement(By.id("moduleTab_Home"));
		Assert.assertTrue(homePage.isDisplayed(), "HomePage not displayed");
	}
	
	@Test
	//Getting colors
	public void TC5()
	{
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.name("Login")).click();
		WebElement homePage = driver.findElement(By.id("moduleTab_Home"));
		Assert.assertTrue(homePage.isDisplayed(), "HomePage not displayed");
		WebElement navigation=driver.findElement(By.className("navbar-header"));
		String color=navigation.getCssValue("color");
		System.out.println("Navigation bar color is "+color);
		String bkgcolor=navigation.getCssValue("background-color");
	}

	
	
}
