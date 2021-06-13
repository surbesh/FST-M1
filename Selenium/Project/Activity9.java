import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
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
	        // verifing the username
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
		    
		    // verifying after login
	        String dashboard = driver.findElement(By.xpath("//div/h1")).getText();
	        System.out.println("After logged in Dashboard is seen:"+dashboard );
	        
	        Assert.assertEquals("Dashboard", dashboard);
	        // Clicking on Job listing
	        driver.findElement(By.xpath("//div/div/div/ul/li[@id='menu-posts-job_listing']")).click();
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        //Click on Add new button
	        driver.findElement(By.xpath("//div/div[4]/a[@class='page-title-action']")).click(); 
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       // Clicking on the next button in the pop up window 
	       driver.findElement(By.xpath("//button[@class='components-button components-guide__forward-button has-text has-icon']")).click();	
	       driver.findElement(By.xpath("//button[@class='components-button components-guide__forward-button has-text has-icon']")).click();
	        driver.findElement(By.xpath("//button[@class='components-button components-guide__forward-button has-text has-icon']")).click();
	        driver.findElement(By.xpath("//button[@class='components-button components-guide__finish-button is-primary']")).click();
	                    
 
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	        //enter the job opening position
	        WebElement position = driver.findElement(By.xpath("//div[@class='wp-block editor-post-title__block']/div/textarea[@id='post-title-0']"));
	        position.sendKeys("Test Automation");
	     
	        // Entering the company website
	        WebElement webSite = driver.findElement(By.xpath("//input[@id='_company_website']"));
	        webSite.sendKeys("https://www.sureshinfotech.com");
	        // entering the company twitter
	        WebElement cTwitter = driver.findElement(By.xpath("//input[@id='_company_twitter']"));
	        cTwitter.sendKeys("#Suresh");
	        // entering the job location
	        WebElement location = driver.findElement(By.xpath("//input[@id='_job_location']"));
	        location.sendKeys("Naicknoor");
	        // entering the company name
	        WebElement companyName = driver.findElement(By.xpath("//input[@id='_company_name']"));
	        companyName.sendKeys("Suresh Infotech");
	        // entering the company tagline
	        WebElement cTagline = driver.findElement(By.xpath("//input[@id='_company_tagline']"));
	        cTagline.sendKeys("Looking beyond fortune 500");
	       // Click on publish buttion
	        driver.findElement(By.xpath("//button[@class='components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary']")).click();
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        // click on publish button
	        driver.findElement(By.xpath("//button[@class='components-button editor-post-publish-button editor-post-publish-button__button is-primary']")).click();
	        
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        //click on view job link
	        driver.findElement(By.xpath("//a[@class='components-button is-secondary']")).click();
	        
	        // verify the Job position
	        String verifyPublish = driver.findElement(By.xpath("//h1")).getText();
	        System.out.println("Verified published:"+verifyPublish );
	        Assert.assertEquals("Test Automation", verifyPublish);
	        
	        
	        
	    }               
	      
	     

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }
}
