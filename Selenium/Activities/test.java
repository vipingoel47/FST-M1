package training;

import java.time.Duration;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class test {
    WebDriver driver;
    WebDriverWait wait;
    
    public void lmsPage() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://alchemy.hguy.co/lms");
    }
    
    public String title() {
        return driver.getTitle();
    }
    
    public void verifyTitle() {
        String pageTitle = title();
        String expectedTitle = "Alchemy LMS – An LMS Application";
        
        if(pageTitle.equals(expectedTitle)) {
        	closeBrowser();
        }
        
        else {
        	System.out.println("Title is not as expected");
        	System.out.println("Expected Title: " + expectedTitle);	
        	System.out.println("Actual Title: " + pageTitle);
        }
    }
 
    public void closeBrowser() {
        //Close browser
        driver.close();
    }
}