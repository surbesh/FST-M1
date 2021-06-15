package seleniumActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		
		
        String sTitle = driver.getTitle();
	    System.out.println(sTitle);
        WebElement firstName = driver.findElement(By.id("firstName"));
    	WebElement lastName = driver.findElement(By.id("lastName"));
	
        //Enter text
	
        firstName.sendKeys("Suresh");
	    lastName.sendKeys("chandrappa");
	    //Enter the email
	    driver.findElement(By.id("email")).sendKeys("example@test.com");
	    //Enter the contact number
	    driver.findElement(By.id("number")).sendKeys("0987654321");
	    //Click Submit
	    driver.findElement(By.cssSelector(".ui.green.button")).click();
	    //Close the browser
	
        driver.close();
	
    }
		
		

	}


