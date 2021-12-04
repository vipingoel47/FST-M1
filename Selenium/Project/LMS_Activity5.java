package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;

public class LMS_Activity5 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void myAccount() {
    	// Go to my account
        driver.findElement(By.xpath("//a[text()='My Account']")).click();
            
        String title = driver.getTitle();
        
        //Assertion for title of My Account page      
        try {
            Assert.assertTrue(title.contains("Yy Account"));
        } catch (AssertionError e) {
        	System.out.println("Title doesn't contain 'My Account'" );
            driver.quit();
            throw e;
        }
        
        System.out.println("You are on correct page. Page title is: " + title);
        
        //close browser;
        driver.quit();
        
    }
}