package seleniumActivity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new instance of the Firefox driver
		 WebDriver driver = new FirefoxDriver();
		 //assigining the url
		 String url="https://www.training-support.net";
		 // Opening the browser with the url
		 driver.get(url);
		 // Closing the browser
		driver.close();

	}

}
