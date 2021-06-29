package projects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	 WebDriverWait wait;
	 AppiumDriver<MobileElement> driver = null;
	
	  @BeforeClass
	    public void setup() throws InterruptedException, IOException {
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "RayaruPixel4");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.google.android.apps.tasks");
	        caps.setCapability("appActivity", ".ui.TaskListsActivity");
	        
	        // Instantiate Appium Driver
	        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	        wait = new WebDriverWait(driver, 10);
	    }
	  
	  @Test
	    public void Googletask() throws Exception {
	    	
	    	String str1 = "Activity with Google Tasks";
	    	String str2 = "Activity with Google Keep";
	    	String str3 = "second Activity Google Keep";
	    	
				Thread.sleep(10000);
			/*
	        driver.findElementById("tasks_fab").click();
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.id("add_task_title")));
	        driver.findElementById("add_task_title").sendKeys(str1);     
	        driver.findElementById("add_task_done").click();
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.id("tasks_fab")));
	       System.out.println("1st Complated");
	       
	       
	        driver.findElementById("tasks_fab").click();
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.id("add_task_title")));
	        driver.findElementById("add_task_title").sendKeys(str2);
	        driver.findElementById("add_task_done").click();
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.id("tasks_fab")));
	        System.out.println("Second Completed");
	        
	        driver.findElementById("tasks_fab").click();
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.id("add_task_title")));
	        driver.findElementById("add_task_title").sendKeys(str3);
	        driver.findElementById("add_task_done").click();
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.id("tasks_fab")));
	     */

	        
				MobileElement createNewtask = driver.findElementById("tasks_fab");		
				createNewtask.click();
				Thread.sleep(10000);
				//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.id("add_task_title")));
				MobileElement addTask = driver.findElementById("add_task_title");
				addTask.sendKeys(str1);
				MobileElement save = driver.findElementById("add_task_done");
				save.click();
				Thread.sleep(10000);
			    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.id("tasks_fab")));
				 
				createNewtask.click();
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.id("add_task_title")));
				addTask.sendKeys(str2);
				save.click();
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.id("tasks_fab")));
				
				createNewtask.click();
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.id("add_task_title")));
				addTask.sendKeys(str3);
				save.click();
				Thread.sleep(10000);
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.id("tasks_fab")));
				
	        List<MobileElement> textItems=driver.findElementsById("task_name");     
	        System.out.println(textItems.size());
	        
	    	
	        for(MobileElement textItem : textItems) {
		
	          
	            if(textItem.getText().equalsIgnoreCase(str1))
	            {
	            //	Assert.assertTrue(true);
	            	System.out.println(textItem.getText());
	            	System.out.println(str1);
	            	Assert.assertEquals(textItem.getText(), str1);
	            }
	            else if(textItem.getText().equalsIgnoreCase(str2))
	            {
	            	System.out.println(textItem.getText());
	            	System.out.println(str2);
	            	Assert.assertEquals(textItem.getText(), str2);
	            }
	            else if(textItem.getText().equalsIgnoreCase(str3))
	            {
	            	System.out.println(textItem.getText());
	            	System.out.println(str3);
	            	Assert.assertEquals(textItem.getText(), str3);
	            }
	            
	            else
	            {
	            	Assert.assertFalse(false);
	            	
	            }
	            
	        }
	        
	    }
		  @AfterClass
		    public void tearDown() {
		        driver.quit();
		    }
		  
		  
	  }
	  

