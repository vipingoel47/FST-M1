package testNG;

import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;
//import java.time.Duration;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
//import org.testng.SkipException;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;

public class DemoReportNG {
    WebDriver driver;
    
    @BeforeClass
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("https://www.training-support.net/");
        Reporter.log("Test Started");
    }
    
    @Test
    public void testCase1() {
        //This test case will pass
        String title = driver.getTitle();
        Reporter.log("Title is: " + title);
        
        Assert.assertEquals("Training Support", title);
    }
    
    @Test
    public void testCase2() {
        //This test case will Fail
        WebElement button = driver.findElement(By.tagName("button"));
        Reporter.log("Element Found");
        
        Assert.assertTrue(button.isDisplayed());
    }
    
    @Test(enabled = false)
    public void testCase3() {
        //This test will be skipped
        Reporter.log("This page title will not be printed: " + driver.getTitle());
    }
    
    @Test
    public void testCase4() {
        //This test will be skipped and will be be shown as skipped
        Reporter.log("Test skipped with Exception");
        throw new SkipException("Skipping test case");
    }

    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.close();
        Reporter.log("Test Completed");
    }
}