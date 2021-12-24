package training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity112 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        
        //print title
        System.out.println(driver.getTitle());

        //Click the button to open a confirm alert
        driver.findElement(By.cssSelector("button#confirm")).click();

        //Switch to alert window
        Alert confirmAlert = driver.switchTo().alert();

        //Get text in the alert box and print it
        String alertText = confirmAlert.getText();
        System.out.println("Alert text is: " + alertText);

        //Close the alert box with accept
        confirmAlert.accept();
        
        //Again click the button to open a confirm alert
        driver.findElement(By.cssSelector("button#confirm")).click();

        //Close the alert box with dismiss
        confirmAlert.dismiss();

        //Close the Browser
        driver.close();
    }
}