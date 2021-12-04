package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;

public class LMS_Activity4 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void checkSecondMostPopularCouseTitle() {
    	// Find the title of the 2nd most popular course
        String title = driver.findElement(By.xpath("(//h3[@class='entry-title'])[2]")).getText();
        String expectedTitle = "Email Marketing Strategies";
            
        //Assertion for title of the 2nd most popular course      
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