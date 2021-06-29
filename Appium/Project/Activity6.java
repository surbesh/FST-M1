package projects;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity6 {

	
	

	
	  AppiumDriver<MobileElement> driver = null;
		
	    WebDriverWait wait;
		
	 @BeforeClass
		
	    public void beforeClass() throws MalformedURLException {
		
	        // Set the Desired Capabilities
		
	        DesiredCapabilities caps = new DesiredCapabilities();
		
	        caps.setCapability("deviceName", "RayaruPixel4");
		
	        caps.setCapability("platformName", "Android");
		
	        caps.setCapability("appPackage", "com.android.chrome");
		
	        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
	        caps.setCapability("noReset", true); 
		
	        // Instantiate Appium Driver
		
	        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		
	        driver = new AndroidDriver<MobileElement>(appServer, caps);
		
	        wait = new WebDriverWait(driver, 5);
		
	 
		
	        driver.get("https://www.training-support.net/selenium");
		
	    }
	 
		
	    @Test
		
	    public void BrwoserAct6() throws InterruptedException {
	    	Thread.sleep(5000);
	    	
	    //	driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollTextIntoView(\"To-Do List\")"));
	    	driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollToEnd(4)"));
	    	driver.findElementByXPath("//android.view.View[contains(@text, 'Popups')]").click();
	    	Thread.sleep(2000);
	    	driver.findElementByXPath("//android.widget.Button[contains(@text, 'Sign In')]").click();
	    	Thread.sleep(2000);
	//    	driver.findElementByXPath("//android.widget.EditText[contains(@resource-id, 'username')]").click();
	    	driver.findElementByXPath("//android.widget.EditText[contains(@resource-id, 'username')]").sendKeys("admin");
	    	driver.findElementByXPath("//android.widget.EditText[contains(@resource-id, 'password')]").sendKeys("password");
	    	driver.findElementByXPath("//android.widget.Button[contains(@text, 'Log in')]").click();
	    	Thread.sleep(2000);
	    	String Successmsg = driver.findElementByXPath("//android.view.View[contains(@resource-id, 'action-confirmation')]").getText();
	    	System.out.println(Successmsg);
	    	Assert.assertEquals(Successmsg, "Welcome Back, admin");
	    	Thread.sleep(2000);
	    	driver.navigate().back();
	    	Thread.sleep(4000);
	    	
	    	
	    	driver.findElementByXPath("//android.view.View[contains(@text, 'Popups')]").click();
	    	Thread.sleep(2000);
	    	driver.findElementByXPath("//android.widget.Button[contains(@text, 'Sign In')]").click();
	    	Thread.sleep(2000);
	//    	driver.findElementByXPath("//android.widget.EditText[contains(@resource-id, 'username')]").click();
	    	driver.findElementByXPath("//android.widget.EditText[contains(@resource-id, 'username')]").sendKeys("admin");
	    	driver.findElementByXPath("//android.widget.EditText[contains(@resource-id, 'password')]").sendKeys("Wrong Password");
	    	driver.findElementByXPath("//android.widget.Button[contains(@text, 'Log in')]").click();
	    	Thread.sleep(2000);
	    	String Failuresmsg = driver.findElementByXPath("//android.view.View[contains(@resource-id, 'action-confirmation')]").getText();
	    	System.out.println(Failuresmsg);
	    	Assert.assertEquals(Failuresmsg, "Invalid Credentials");
	    	Thread.sleep(2000);
	    	driver.navigate().back();
	    	Thread.sleep(4000);
	    	
	    	
	
	    	
	    	
			
	    }
		
	 
		
@AfterClass
		
	    public void afterClass() {
		
	        driver.quit();
		
	    }
	
	




}
