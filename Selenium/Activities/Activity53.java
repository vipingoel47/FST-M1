package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;

public class Activity53 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
        
        //print title
        System.out.println(driver.getTitle());
        
        //Find text field and its status
        WebElement textField = driver.findElement(By.xpath("//input[@id='input-text']"));
        System.out.println("Text field enabled?" + textField.isEnabled());
        
        //Enable text field
        driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
      
        //Find text field status again
        System.out.println("Text field enabled?" + textField.isEnabled());
        
        //Close the browser
        driver.quit();
    }
}