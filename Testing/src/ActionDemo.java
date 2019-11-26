import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","/Users/vamsichowdary/Movies/chromedriver");
       System.setProperty("webdriver.chrome.driver", "/Users/vamsichowdary/Movies/chromedriver");
		WebDriver demo=new ChromeDriver();
		Actions a = new Actions(demo);
		demo.get("https://www.amazon.ca/");
		WebElement v1 = demo.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(v1).click().keyDown(Keys.SHIFT).sendKeys("vamsi").build().perform();

	}

}
