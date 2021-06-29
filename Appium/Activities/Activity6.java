package activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
     //   URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
     //   driver = new AndroidDriver<MobileElement>(appServer, caps);
     //   wait = new WebDriverWait(driver, 5);
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.training-support.net/selenium/lazy-loading");   
    }

    @Test
    public void imageScrollTest() throws InterruptedException {
    	
        // wait for page to load
    	Thread.sleep(10000);
        //MobileElement pageTitle = driver.findElementByClassName("android.widget.TextView");
        //wait.until(ExpectedConditions.textToBePresentInElement(pageTitle, "Lazy Loading"));
        // Count the number of images shown on the screen
        List<MobileElement> numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
        System.out.println("Number of image shown currently: " + numberOfImages.size());
	
        // Assertion before scrolling
        //Assert.assertEquals(numberOfImages.size(), 2);
        // Scroll to Helen's post
        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollTextIntoView(\"helen\")"));
        // Find the number of images shown after scrolling
	
        numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
	
        System.out.println("Number of image shown currently: " + numberOfImages.size());
        // Assertion after scrolling
	
        //Assert.assertEquals(numberOfImages.size(), 5);
         Assert.assertNotEquals(numberOfImages.size(), 0);
	
    }

    @AfterClass
    public void afterClass() {
       driver.quit();
    }
}
