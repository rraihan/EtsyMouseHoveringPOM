package etsyTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomeHoverTestScripts {
	WebDriver driver = null;
	
	public EtsyHomeHoverTestScripts(WebDriver driver) {
		
		
	this.driver=driver;
		
		
	}
	
	
	/*
	 * public EtsyHomeHoverTestScripts(WebDriver driver) { this.driver = driver;
	 * PageFactory.initElements(driver, this);
	 */
		
	By jewelry=By.cssSelector("#catnav-primary-link-10855"); 
		
		
	

	    public void moushovering()  {
		Actions actions = new Actions(driver);
		WebElement hover = driver.findElement(jewelry);
			
		actions.moveToElement(hover).doubleClick().build().perform();
		
		
		
		
		
	}

	/*
	 * @FindBy(css = "#catnav-primary-link-10855") WebElement HF;
	 * 
	 * public void mouseHovering() { Actions action = new Actions(driver);
	 * action.moveToElement(HF).perform();
	 * 
	 * }
	 */

}
