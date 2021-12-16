package SelActivity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
DesiredCapabilities capabilities=new DesiredCapabilities();
//capabilities.acceptInsecureCerts();
//		WebDriver driver = new ChromeDriver();
		driver.get("https://www.training-support.net/");
		driver.close();
	}

}
