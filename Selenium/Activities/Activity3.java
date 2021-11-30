package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;

public class Activity3 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://training-support.net/selenium/simple-form");
        
        //print title
        System.out.println(driver.getTitle());
        
        //Find first name field and enter fname
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("First");
        
        //Find last name field and enter lname
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Last");
        
        //Find email field and enter email
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("first.last@test.com");
        
        //Find phone field and enter phone no.
        WebElement phone = driver.findElement(By.id("number"));
        phone.sendKeys("8889990000");
        
        //driver.findElement(By.cssSelector(".ui.green.button")).click();
        driver.findElement(By.cssSelector("input.green")).click();
        
        //Close the browser
        driver.quit();
    }
}