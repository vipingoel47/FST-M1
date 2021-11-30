package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Activity41 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net");
        
        //Get title and print
        System.out.println(driver.getTitle());
        
        //Find element 'About us' using xpath and click
        driver.findElement(By.xpath("//*[@id='about-link']")).click();
               
        //Get title of 'About us' page and print
        System.out.println(driver.getTitle());
        
        //Close the browser
        driver.close();
    }
}