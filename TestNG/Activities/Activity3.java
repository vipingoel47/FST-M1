package testNG;

import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.testng.SkipException;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Activity3 {
    WebDriver driver;
    
    @BeforeClass
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    public void login() {
    	//find username and password fields
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        
        //enter credentials
        username.sendKeys("admin");
        password.sendKeys("password");
        
        //Click login
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
        //Read login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin", loginMessage);
       
    }
    
    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}