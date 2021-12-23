package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;

public class Activity72 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        
        //Open the browser
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        
        //print title
        System.out.println(driver.getTitle());
        
        //Find the username field of the sign-up form and enter 'admin' as the username 
        driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("admin"); 
                
        //Find the password field of the sign-up form and enter 'password' as the password 
        driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("password");

        
        //Find confirm-password field of the sign-up form and enter 'password' as the password 
        driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input")).sendKeys("password");
        
        //Find email field of the sign-up form and enter email 
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@xyz.com");
        
        //Click 'Sign Up' button 
        driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
        
        //Wait for welcome msg and then print it 
        WebElement confirmMsg = driver.findElement(By.xpath("//*[@id='action-confirmation']"));
        wait.until(ExpectedConditions.visibilityOf(confirmMsg));
        System.out.println(confirmMsg.getText());
        
        //Close the browser
        driver.quit();
    }
}