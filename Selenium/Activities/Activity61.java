package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;

public class Activity61 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //Open the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
        
        //print title
        System.out.println(driver.getTitle());
        
        //Find checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
        
        //Find checkbox toggle button and click it
        WebElement toggleCheckbox = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        toggleCheckbox.click();
        
        //Wait for checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        
        //Toggle checkbox again
        toggleCheckbox.click();
      
        //Wait for checkbox to appear again, and then check it
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
        
        //Close the browser
        driver.quit();
    }
}