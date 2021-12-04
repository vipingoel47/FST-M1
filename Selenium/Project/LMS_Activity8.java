package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;

public class LMS_Activity8 {
    WebDriver driver;
    
    String fullName = "Atul Sharma";
    String email = "atul.sharma@test.com";
    String subject = "Test";
    String message = "Hi there!!";
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void contactAdmin() {
    	// Select the menu item that says “Contact” and click it
        driver.findElement(By.xpath("//a[text()='Contact']")).click();
        
        //Find and fill the contact form fields (Full Name, email, etc.)
        driver.findElement(By.xpath("//label[contains(text(),'Full Name')]/following::input")).sendKeys(fullName);
        driver.findElement(By.xpath("//label[contains(text(),'Email')]/following::input")).sendKeys(email);
        driver.findElement(By.xpath("//label[contains(text(),'Subject')]/following::input")).sendKeys(subject);
        driver.findElement(By.xpath("//label[contains(text(),'Comment or Message')]/following::textarea")).sendKeys(message);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        //Read and print the message displayed after submission
        WebElement confirmMsg = driver.findElement(By.xpath("//div[contains(@class,'wpforms-confirmation')]/p"));
        if(confirmMsg.isDisplayed()) {
        	System.out.println("Confirmation Message: " + confirmMsg.getText());
        }
        
        //close browser;
        driver.quit();
        
    }
}