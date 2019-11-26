import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Safari {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/vamsichowdary/Movies/geckodriver");
	  FirefoxDriver obj2= new FirefoxDriver();
	  obj2.get("https://www.youtube.com");
	  System.out.println(obj2.getCurrentUrl());
	  Thread.sleep(500);
	  obj2.close();
	  
	  
	  

	}

}
