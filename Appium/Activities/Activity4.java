package AppiumActivities;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity4 {
	WebDriverWait wait;
	AppiumDriver<MobileElement> driver = null;

	@BeforeTest
	public void setup() throws MalformedURLException {

		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceId", "2eed910sa");
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);

		// Instantiate Appium Driver
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		wait = new WebDriverWait(driver, 10);
	}

	 @Test
	    public void addContact() {
	        // Click on add new contact floating button
	        driver.findElementByAccessibilityId("Create new contact").click();
	        
	        // Find the first name, last name, and phone number fields
	        MobileElement firstName = driver.findElementByXPath("//android.widget.EditText[@text='First name']");
	        MobileElement lastName = driver.findElementByXPath("//android.widget.EditText[@text='Surname']");
	        MobileElement phoneNumber = driver.findElementByXPath("//android.widget.EditText[@text='Phone']");
	        
	        // Enter the text in the fields
	        firstName.sendKeys("Aaditya");
	        lastName.sendKeys("Varma");
	        phoneNumber.sendKeys("9991284782");
	        
	        // Save the contact
	        driver.findElementById("editor_menu_save_button").click();
	        
	        // Wait for contact card to appear
	        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("toolbar_parent")));
	 
	        // Assertion
	        MobileElement mobileCard = driver.findElementById("toolbar_parent");
	        Assert.assertTrue(mobileCard.isDisplayed());
	        
	        String contactName = driver.findElementById("large_title").getText();
	        Assert.assertEquals(contactName, "Aaditya Varma");
	    }
	 
	    @AfterClass
	    public void afterClass() {
	        driver.quit();
	    }
}
