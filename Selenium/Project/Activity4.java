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

public class Activity4 {
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
	    public void verifyHeaderTestCase() {
	        // Check the title of the page
	        String title = driver.getTitle();
	            
	        //Print the title of the page
	        System.out.println("Page title is: " + title);
	            
	            //Assertion for  header
	        String headerName = driver.findElement(By.xpath("//h2")).getText();
	        System.out.println("Page header is: " + headerName);
	       Assert.assertEquals("Quia quis non", headerName);
	                    
	     }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	       driver.quit();
	    }
}
