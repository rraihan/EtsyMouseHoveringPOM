package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EtsyRoughcCass {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
		WebDriver  driver =new ChromeDriver();

		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();
		
		
		Actions actions = new Actions(driver);
					
		WebElement ele =driver.findElement(By.cssSelector("#catnav-primary-link-10855"));
				
		
		actions.moveToElement(ele).perform();
		
		
	}

}
