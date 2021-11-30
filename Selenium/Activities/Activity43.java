package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;

public class Activity43 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net/selenium/target-practice");
        
        //print title
        System.out.println(driver.getTitle());
        
        //Find 3rd header
        System.out.println(driver.findElement(By.xpath("//h3[@id='third-header']")).getText());
        
        //Find 5th header and its color
        System.out.println(driver.findElement(By.xpath("//h5[contains(@class,'ui green')]")).getCssValue("color"));
        
        //Find violet button and all its attributes
        System.out.println(driver.findElement(By.xpath("//button[contains(@class,'violet')]")).getAttribute("class"));
        
        //Find grey button with abs xpath
        System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText());
        
        //Close the browser
        driver.quit();
    }
}