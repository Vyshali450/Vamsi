import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//**This is Example for Explict Wait

public class DemoExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vamsichowdary/Movies/chromedriver");
		WebDriver demo = new ChromeDriver();
		demo.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		WebDriverWait time= new WebDriverWait(demo,5);
		demo.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		time.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")));
		System.out.println(demo.findElement(By.xpath("//div[@id='results']")).getText());
		     
		

	}

}
