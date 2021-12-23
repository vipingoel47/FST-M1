package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;

public class Activity62 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //Open the browser
        driver.get("https://training-support.net/selenium/ajax");
        
        //print title
        System.out.println(driver.getTitle());
        
        //Find and click the "Change content" button on the page
        driver.findElement(By.xpath("//button[@class='ui violet button']")).click();
        
        //Wait for text to load
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
 
        //getText() and print it
        System.out.println(driver.findElement(By.id("ajax-content")).getText());
              
        //Wait for late text
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        
        //Get late text and print it
        System.out.println(driver.findElement(By.id("ajax-content")).getText());
        
        //Close the browser
        driver.quit();
    }
}