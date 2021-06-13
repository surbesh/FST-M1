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

public class Activity5 {
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
	        
	       
	       // Clicking on Jobs link 
	        WebElement linkJobs = driver.findElement(By.linkText("Jobs"));
	        linkJobs.click();
	        
	        // Check the title of the page
	        String jobpagetitle = driver.getTitle();
	            
	        //Print the title of the page
	        System.out.println("Page title is: " + jobpagetitle);
	            
	            //Assertion for page title
	        Assert.assertEquals("Jobs – Alchemy Jobs", jobpagetitle);
	            
	                    
	     }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	        driver.quit();
	    }
}
