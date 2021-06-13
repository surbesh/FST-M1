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

public class Activity6 {
	 WebDriver driver;
	    
	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	         
	        driver.get("https://alchemy.hguy.co/jobs");
	        driver.manage().window().maximize();
	        
	        WebDriverWait wait = new WebDriverWait(driver, 20);
	        By addItem = By.xpath("//h1[@class='entry-title']");
	        // get the "Add Item" element
	        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(addItem));
	    }

	    @Test
	    public void clickLinkTestCase() {
	        // Check the title of the page
	        String title = driver.getTitle();
	            
	        //Print the title of the page
	        System.out.println("Page title is: " + title);
	        
	       // Clicking on the jobs link
	        
	        WebElement linkJobs = driver.findElement(By.linkText("Jobs"));
	        linkJobs.click();
	        
	        // Check the title of the page
	        String jobpagetitle = driver.getTitle();
	            
	        //Print the title of the page
	        System.out.println("Page title is: " + jobpagetitle);
	            
	            //Assertion for page title
	        Assert.assertEquals("Jobs – Alchemy Jobs", jobpagetitle);
	        // entering the search keyword
	        WebElement search = driver.findElement(By.id("search_keywords"));
	        search.sendKeys("Banking");
	        // click on search button
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        // Click on the link of the jobs
	        driver.findElement(By.xpath("//h3")).click();
	        
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        // Applying for job
	        driver.findElement(By.xpath("//input[@type='button']")).click();   
	       // getting and printing the emailid 
	        String emailId = driver.findElement(By.xpath("//div/main/article/div/div/div/div/div/p/a[@class='job_application_email']")).getText();
	        System.out.println("This is an email id for applying for job : " +emailId );
	        
	        
	        
	                    
	     }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }
}
