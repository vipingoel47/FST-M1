package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Activity81 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
              
        //Open the browser
        driver.get("https://training-support.net/selenium/tables");
        
        //Find no. of cols. in static table 
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
        System.out.println("No. of columns in the Static table = " + cols.size());
        
        //Find no. of rows. in static table 
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));
        System.out.println("No. of rows in the Static table = " + rows.size());
        
        //Find and print the elements of the third row in static table 
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td"));
        for(WebElement row3: thirdRow) {
        	System.out.println(row3.getText());        
        }  
        
        //Find and print cell value of 2nd row and 2nd column
        System.out.println(driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]")).getText());;        
        
        //Close the browser
        driver.quit();
    }
}