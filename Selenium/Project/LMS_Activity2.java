package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;

public class LMS_Activity2 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void checkHeading() {
    	// Check the heading of the webpage
        String heading = driver.findElement(By.xpath("//h1")).getText();
        String expectedHeading = "Learn from Industry Experts";
            
        //Assertion for page heading        
        try {
            Assert.assertEquals(expectedHeading, heading);
        } catch (AssertionError e) {
        	System.out.println("Heading is not as expected");
        	System.out.println("Expected Heading: " + expectedHeading);	
        	System.out.println("Actual Heading: " + heading);
            throw e;
        }
        
        //close browser if the title is as expected;
        System.out.println("Actual title is as expected: " + heading);
        driver.quit();
    }
}