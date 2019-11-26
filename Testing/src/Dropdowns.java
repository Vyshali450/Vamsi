import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/vamsichowdary/Movies/chromedriver");
		WebDriver ob = new ChromeDriver();
		ob.get("https://www.spicejet.com");
		ob.manage().window().maximize();
		Thread.sleep(2000);
		ob.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("VGA");
		Thread.sleep(2000);
		ob.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("HYD");
		Thread.sleep(1000);

		ob.findElement(By.className("ui-state-default ui-state-highlight ui-state-active")).click();
		// ob.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_StudentDiscount']")).click();
		ob.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

		Select s = new Select(ob.findElement(By.name("ctl00$mainContent$ddl_Adult")));
		s.selectByValue("5");
		/*
		 * int i = 5; while(i<5) {
		 * 
		 * }
		 */

		System.out.println(ob.findElement(By.name("ctl00$mainContent$ddl_Adult")).getText());
		// ob.findElement(By.cssSelector("select[name='ctl00$mainContent$DropDownListCurrency']"));
		// s.selectByVisibleText("AED");

		Select s2 = new Select(ob.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		s2.selectByVisibleText("AED");
		ob.findElement(By.xpath("//input[@value='Search']")).click();

		// s.selectByVisibleText("5 Adults");
		// System.out.println(s.getAllSelectedOptions());
		System.out.println(ob.getCurrentUrl());
	}

}
