package etsyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class MouseHoverRunner {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/resources/features", 
				glue = "stepsDefination", monochrome = true, 
				plugin = {"pretty", "json:etsy-reports/etsy.jason",
				"junit:etsy-reports/etsy.xml",
			    "html:etsy-reports/etsy.html" })
				//tags = "@pom")

	public class TestRunner {
		
		

	}
	
	
	
	
	

}
