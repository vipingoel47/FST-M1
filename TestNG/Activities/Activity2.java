package testNG;

import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Activity2 {
    WebDriver driver;
    
    @BeforeClass
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void title() {
    	// Check the title of the page
        String title = driver.getTitle();
            
        //Assertion for page title
        Assert.assertEquals("Target Practice", title);
        
    }
    
    @Test
    public void blackButton() {
        //Find the black button
        WebElement blackButton = driver.findElement(By.xpath("//button[@class='ui black button']"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
       
    }
    
    @Test(enabled = false)
    public void skippedTest1() {
        //This test will be skipped and not counted
        WebElement pinkButton = driver.findElement(By.xpath("//button[@class='ui pink button']"));
        System.out.println(pinkButton.getText());
        
    }
    
    @Test
    public void skippedTest2() throws SkipException{
        //This test will be skipped and will be be shown as skipped
        throw new SkipException("Skipping test case");      
    }

    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}