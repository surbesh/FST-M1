import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
	 WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	         
	        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	        driver.manage().window().maximize();
	        
	        WebDriverWait wait = new WebDriverWait(driver, 20);
	        By addItem = By.xpath("//div/form/p/label");
	        // get the "Add Item" element
	        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(addItem));
	    }

	    @Test
	    public void backendLoginTestCase() {
	        // Check the title of the page
	        String title = driver.getTitle();
	            
	        //Print the title of the page
	        System.out.println("Page title is: " + title);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        //verifying the username
	        String sUserName = driver.findElement(By.xpath("//div/form/p/label")).getText();
	        System.out.println("Username field found:"+sUserName );
	        Assert.assertEquals("Username or Email Address", sUserName);
	        // entering the username
	        WebElement userName = driver.findElement(By.xpath("//input[@id='user_login']"));
	        userName.sendKeys("root");
	        
	        // verifying the password
	        String sPassword = driver.findElement(By.xpath("//div/form/div/label")).getText();
	        System.out.println("Password field found:"+sPassword );
	        Assert.assertEquals("Password", sPassword);
	        
	        // entering the password	       
	        WebElement userPassword = driver.findElement(By.xpath("//input[@id='user_pass']"));
	        userPassword.sendKeys("pa$$w0rd");
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
             // click on login button
	        driver.findElement(By.xpath("//div/form/p[3]/input[@id='wp-submit']")).click();
		       
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    // verifying the login page
	        String dashboard = driver.findElement(By.xpath("//div/h1")).getText();
	        System.out.println("After logged in Dashboard is seen:"+dashboard );
	        Assert.assertEquals("Dashboard", dashboard);
	        
	    
	        
	     }
	  

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }
}
