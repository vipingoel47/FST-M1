package training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity113 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        
        //print title
        System.out.println(driver.getTitle());

        //Click the button to open a prompt alert
        driver.findElement(By.cssSelector("button#prompt")).click();

        //Switch to alert window
        Alert promptAlert = driver.switchTo().alert();

        //Get text in the alert box and print it
        String alertText = promptAlert.getText();
        System.out.println("Alert text is: " + alertText);
        promptAlert.sendKeys("Yes, you are!");
        
        //Close the alert box with accept
        promptAlert.accept();
        
        //Close the Browser
        driver.close();
    }
}