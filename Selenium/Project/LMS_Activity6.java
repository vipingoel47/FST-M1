package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;

public class LMS_Activity6 {
    WebDriver driver;
    
    String username = "root";
    String password = "pa$$w0rd";
    //String welcomeMsg = "Howdy, " + username;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void myAccountLogin() {
    	// Go to my account
        driver.findElement(By.xpath("//a[text()='My Account']")).click();
            
        String title = driver.getTitle();
        
        //Assertion for title of My Account page      
        try {
            Assert.assertTrue(title.contains("My Account"));
        } catch (AssertionError e) {
        	System.out.println("Title doesn't contain 'My Account'" );
            driver.quit();
            throw e;
        }
        
        System.out.println("You are on correct page. Page title is: " + title);
        
        //Click on login button, enter credentials and login  
        driver.findElement(By.xpath("//a[contains(@class,'ld-login')]")).click();
        driver.findElement(By.id("user_login")).sendKeys(username);
        driver.findElement(By.id("user_pass")).sendKeys(password);
        driver.findElement(By.id("wp-submit")).click();
        
        //Assertion for successful login
        WebElement greeting = driver.findElement(By.xpath("//*[@class='display-name']"));
        try {
        	Assert.assertTrue(greeting.isDisplayed());
        } catch (AssertionError e) {
        	System.out.println("Login unsuccessful, please check msg on screen for error." );
            driver.quit();
            throw e;
        }
        
        System.out.println("Login successful.");
        
        //close browser;
        driver.quit();
    }
}