package seleniumActivity;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class ClassName {
	    public static void main(String[] args) {
	        //Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();

	        //Open the browser
	        driver.get("https://www.example.com");
	       
	        
	           
	        //Close the browser
	        driver.close();
	    }
	

}