package FST.SelProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CRMProject {
	WebDriver driver;
	WebDriverWait wait;
	Actions builder;

//	@BeforeSuite
//	public void beforeTest() {
//		driver = new ChromeDriver();
//		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		builder = new Actions(driver);
//	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		builder = new Actions(driver);
		driver.manage().window().maximize();
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
		System.out.println("URL of the header image is " + imgSrc.getAttribute("src"));
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
		WebElement homePage = driver
				.findElement(By.xpath("//a[@class='navbar-brand with-home-icon suitepicon suitepicon-action-home']"));
		wait.until(ExpectedConditions.titleContains("SuiteCRM"));
		Assert.assertTrue(homePage.isDisplayed(), "HomePage not displayed");
	}

	@Test
	// Getting colors
	public void TC5() {
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.name("Login")).click();
		WebElement navigation = driver.findElement(By.className("navbar-header"));
		String color = navigation.getCssValue("color");
		System.out.println("Navigation bar color is " + color);
//		String bkgcolor = navigation.getCssValue("background-color");
	}

	@Ignore
	// Menu checking
	public void TC6() {
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.name("Login")).click();
		String menuCheck = driver.findElement(By.id("grouptab_3")).getText();
		Assert.assertEquals(menuCheck, "ACTIVITIES", "Activities Menu Item doesnt exist");
	}

	@Test
	// Reading additional information
	public void TC7() {
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.id("grouptab_0")).click();
		driver.findElement(By.id("moduleTab_9_Leads")).click();
		WebElement leadPge = driver.findElement(By.xpath("//h2[@class='module-title-text']"));
		wait.until(ExpectedConditions.visibilityOf(leadPge));
		leadPge.click();
		List<WebElement> phone = driver.findElements(By.xpath("//tr//td[@type='phone']"));
//		System.out.println("row size" + phone.size());
		WebElement lastButton = driver.findElement(By.xpath(
				"//button[@id='listViewEndButton_top']//following-sibling :: span[@class='suitepicon suitepicon-action-last']"));
		lastButton.click();
		driver.findElement(By.xpath("//span[@title='Additional Details']")).click();
		String LeadPhoneNumber = driver.findElement(By.xpath("//span[@class='phone']")).getText();
		System.out.println("PhoneNumber is " + LeadPhoneNumber);

	}

	@Test
	public void TC8() throws InterruptedException {
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.id("grouptab_0")).click();
		driver.findElement(By.id("moduleTab_9_Accounts")).click();
		wait.until(ExpectedConditions.titleContains("Accounts » SuiteCRM"));
		Assert.assertEquals(driver.getTitle(), "Accounts » SuiteCRM", "Not in Accounts Page");
		for (int i = 1; i < 6; i++) {
			List<WebElement> tdata = driver
					.findElements(By.xpath("//tbody//tr[@class='oddListRowS1'][" + i + "]//td[@align='left']"));
			for (WebElement data : tdata) {
				System.out.println(data.getText());

			}

		}

	}

	@Test
	@Ignore
	public void TC9() {
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.id("grouptab_0")).click();
		driver.findElement(By.id("moduleTab_9_Leads")).click();
		WebElement lastButton = driver.findElement(By.xpath("//span[@class='suitepicon suitepicon-action-last']"));
		wait.until(ExpectedConditions.visibilityOf(lastButton));

		for (int i = 1; i < 11; i++) {
			List<WebElement> tdata = driver
					.findElements(By.xpath("//tr[" + i + "]//td[@type='name' or @type='relate']"));

			for (WebElement data : tdata) {
				System.out.println(data.getText());

			}

		}

	}
}
