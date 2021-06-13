import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
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
	    public void postJobsTestCase() {
	        // Check the title of the page
	        String title = driver.getTitle();
	            
	        //Print the title of the page
	        System.out.println("Page title is: " + title);
	        
	     
	     // Clicking on the link post a job   
	        WebElement postJobs = driver.findElement(By.linkText("Post a Job"));
	        postJobs.click();
	        
	        // Check the title of the page
	        String jobpagetitle = driver.getTitle();
	            
	        //Print the title of the page
	        System.out.println("Page title is: " + jobpagetitle);
	            
	            //Assertion for page title
	        Assert.assertEquals("Post a Job – Alchemy Jobs", jobpagetitle);
	        
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        // creating a random mumber
	        Random randomGenerator = new Random();  
	        int randomInt = randomGenerator.nextInt(1000);  
	        
	        // entering the email id
	        WebElement email = driver.findElement(By.id("create_account_email"));
	        email.sendKeys("Suresh"+randomInt+"@suresh.com");
	       // entering the job title
	       WebElement jobTitle = driver.findElement(By.id("job_title"));
	       jobTitle.sendKeys("Test Automation Specialist");
	       // entering the job location
	       WebElement jobLocation = driver.findElement(By.id("job_location"));
	       jobLocation.sendKeys("Naicknoor");
	       
	       // switching to job frame
	       driver.switchTo().frame("job_description_ifr");
	       WebElement description = driver.findElement(By.id("tinymce"));
	       description.sendKeys("Suresh Infotech is a Fortune 500 company going for IPO");
	       // switch to windows
	       driver.switchTo().defaultContent();
	       //entering company url
	       WebElement application = driver.findElement(By.xpath("//input[@id='application']"));
	       application.sendKeys("https://suresh.com");
	       
	       
	       // entering the company name
	       WebElement company = driver.findElement(By.id("company_name"));
	       company.sendKeys("Suresh Infotech");
	       //entering the company website
	       WebElement website = driver.findElement(By.id("company_website"));
	       website.sendKeys("https://suresh.com");
	       // entering the company tabline
	       WebElement Tagline = driver.findElement(By.id("company_tagline"));
	       Tagline.sendKeys("Suresh next Gen products");
	       // entering the company video
	       WebElement video = driver.findElement(By.id("company_video"));
	       video.sendKeys("None as of now");
	       // entering the twitter 
	       WebElement tUsername = driver.findElement(By.id("company_twitter"));
	       tUsername.sendKeys("#suresh");
	       
	       // verifying the preview
	       driver.findElement(By.xpath("//input[@value='Preview']")).click();
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       // Click on submit
	       driver.findElement(By.xpath("//input[@value='Submit Listing']")).click();
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       // click on job links
	       WebElement linkJobs = driver.findElement(By.linkText("Jobs"));
	        linkJobs.click();
	        
            //Assertion for posting the job
        String jobPostTitle = driver.findElement(By.xpath("//div/div/div/main/article/div/div/ul/li[3]/a/div/h3")).getText();
        System.out.println("Job posting title: " + jobPostTitle);
        Assert.assertEquals("Test Automation Specialist", jobPostTitle);
	        
	      
	     }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }
}
