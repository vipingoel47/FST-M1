package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;

public class LMS_Activity1 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void checkTitle() {
    	// Check the title of the page
        String title = driver.getTitle();
        String expectedTitle = "Alchemy LMS – An LMS Application";
            
        //Assertion for page title        
        try {
            Assert.assertEquals(expectedTitle, title);
        } catch (AssertionError e) {
        	System.out.println("Title is not as expected");
        	System.out.println("Expected Title: " + expectedTitle);	
        	System.out.println("Actual Title: " + title);
            throw e;
        }
        
        //close browser if the title is as expected();
        System.out.println("Actual title is as expected: " + title);
        driver.quit();
    }
}