import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//** Selenium Grid
//** hub and nodes register
//** grid allows you can run your tests on different machines and different browsers
//hint for other system conector
/***java -Dwebdriver.chrome.driver="c:\Users\nuvvulavyshali\Downloads\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://192.168.2.16:4444/grid/register -port 5566
***/

public class SelGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		WebDriver driver =new RemoteWebDriver(new URL("http://192.168.2.16:4444/wd/hub"),dc);
		driver.get("https://www.google.com/");
		
		

	}

}
