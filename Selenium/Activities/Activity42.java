package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;

public class Activity42 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://training-support.net/selenium/simple-form");
        
        //print title
        System.out.println(driver.getTitle());
        
        //Find first name field and enter fname
        driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("First");
        
        //Find last name field and enter lname
        driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Last");      
        
        //Find email field and enter email
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("first.last@test.com");
               
        //Find phone field and enter phone no.
        driver.findElement(By.xpath("//*[@id='number']")).sendKeys("8889990000");
        
        //Message area
        driver.findElement(By.xpath("//textarea")).sendKeys("Test message");
                
        //driver.findElement(By.cssSelector(".ui.green.button")).click();
        driver.findElement(By.xpath("//*[@class='ui green button']")).click();
        
        //Close the browser
        driver.quit();
    }
}