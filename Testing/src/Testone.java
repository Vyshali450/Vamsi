import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Testone {
    @Test
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vamsichowdary/Movies/chromedriver");
		WebDriver obj = new ChromeDriver();
		obj.manage().timeouts().implicitlyWait(5,TimeUnit.MILLISECONDS );
		//obj.get("https://www.google.com");
	//	System.out.println(obj.getTitle());
	//	System.out.println(obj.getCurrentUrl());
		//System.out.println(obj.getPageSource());
		obj.get("https://www.facebook.com");
		obj.manage().window().maximize();
		System.out.println(obj.getCurrentUrl());
		
			//obj.navigate().back();
			obj.findElement(By.id("email")).sendKeys("katragadda450@gmail.com");
			obj.findElement(By.cssSelector("#pass")).sendKeys("2263498020");
			
		
			try{
				obj.findElement(By.xpath("//input[@aria-label='Log In']")).click();
			
			obj.findElement(By.xpath("//span[@class='_1vp5']"));
			obj.findElement(By.xpath("//a[@role='button']")).click();
			obj.findElement(By.xpath("//a[@value='Close']")).click();
			System.out.println(obj.getCurrentUrl());
			obj.findElement(By.xpath("//div[@class='_6qfu _5lxt']")).click();
			System.out.println(obj.getCurrentUrl());

			obj.findElement(By.xpath("//span[@class='_54nh']")).click();
			
			}catch( Exception e)
			{
				System.out.println(e);
			}

			

			System.out.println(obj.getCurrentUrl());
			obj.get("https://coinmarketcap.com/");
			System.out.println(obj.getCurrentUrl());

			obj.close();
		//Select s = new Select(obj.findElement(By.xpath("")));
		
	}
	

}
