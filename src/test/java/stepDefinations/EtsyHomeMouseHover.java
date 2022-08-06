package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import etsyTestScripts.EtsyHomeHoverTestScripts;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EtsyHomeMouseHover {
	
	WebDriver driver=null;
	
	
	
	
	
	@Given("user is on Etsy Home page")
	public void user_is_on_etsy_home_page() {
		
		System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.navigate().to("https://www.etsy.com/");
		driver.manage().window().maximize();
		
		
			
	    
	}

	@When("Auto Action class generate")
	public void auto_action_class_generate() throws InterruptedException {
		
	EtsyHomeHoverTestScripts mouse= new EtsyHomeHoverTestScripts(driver);
		
	mouse.moushovering();	
	   
	}

	@Then("mouse will hover on home favorites by itself")
	public void mouse_will_hover_on_home_favorites_by_itself() {
		
		
		driver.getCurrentUrl();
		
		driver.close();
		driver.quit();
		
		
		
		
	   
	}

	
	
	

}
