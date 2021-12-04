package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;

public class LMS_Activity3 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void checkFirstInfoBoxTitle() {
    	// Find the title of the first info box
        String title = driver.findElement(By.xpath("(//h3[@class='uagb-ifb-title'])[1]")).getText();
        String expectedTitle = "Actionable Training";
            
        //Assertion for title of the first info box       
        try {
            Assert.assertEquals(expectedTitle, title);
        } catch (AssertionError e) {
        	System.out.println("Title is not as expected");
        	System.out.println("Expected title: " + expectedTitle);	
        	System.out.println("Actual title: " + title);
            throw e;
        }
        
        //close browser if the title is as expected;
        System.out.println("Actual title is as expected: " + title);
        driver.quit();
    }
}