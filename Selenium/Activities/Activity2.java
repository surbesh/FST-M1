package seleniumActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
	   
	    		    	
	        //Create a new instance of the Firefox driver
		
	        WebDriver driver = new FirefoxDriver();
	      //assigining the url
			 String url="https://www.training-support.net";
			 // Opening the browser with the url
			 driver.get(url);
		
	        //Check the title of the page
		    String title = driver.getTitle();
		
	        //Print the title of the page
		   System.out.println("Page title is: " + title);
		    //Find the About Us link using id()
	        WebElement idLocator = driver.findElement(By.id("about-link"));
		
	        System.out.println("Text in element: " + idLocator.getText());
	
	        //Find About Us link using the className()
	        WebElement classNameLocator = driver.findElement(By.className("green"));
	        System.out.println("Text from an element: " + classNameLocator.getText());
	        //Find  About Us link using the cssSelector()
	        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
	        System.out.println("Text from an element: " + cssLocator.getText());
	        //Find About Us link using the linkText()
	        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
	        System.out.println("Text from an element: " + linkTextLocator.getText());
	        //Close the browser
	        driver.close();
		
	    }

	}

