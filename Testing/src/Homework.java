import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework {
    @Test
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/vamsichowdary/Movies/chromedriver");
		WebDriver objec = new ChromeDriver();
		objec.get("http://qaclickacademy.com/practice.php");
		objec.manage().window().maximize();
		objec.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		// objec.findElement(By.xpath("//input[@id='checkBoxOption1']")).isDisplayed()
		System.out.println(objec.findElement(By.xpath("//input[@id='checkBoxOption1']")).isDisplayed());
		objec.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		System.out.println(objec.findElement(By.xpath("//input[@id='checkBoxOption1']")).isDisplayed());
      //  objec.close();
		objec.findElements(By.xpath("//input[@value='checkbox']")).size();
		System.out.println(objec.findElements(By.xpath("//input[@value='checkbox']")).size());
		objec.close();
		}
        
        


	}


