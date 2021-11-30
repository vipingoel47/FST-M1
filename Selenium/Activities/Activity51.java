package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;

public class Activity51 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
        
        //print title
        System.out.println(driver.getTitle());
        
        //Find checkbox and its status
        WebElement checkbox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
        System.out.println("Checkbox status:" + checkbox.isDisplayed());
        
        //Remove checkbox
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
      
        //Find checkbox status again
        System.out.println("Checkbox status:" + checkbox.isDisplayed());
        
        //Close the browser
        driver.quit();
    }
}