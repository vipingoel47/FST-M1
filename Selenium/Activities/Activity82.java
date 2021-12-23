package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;

public class Activity82 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
              
        //Open the browser
        driver.get("https://training-support.net/selenium/tables");
        
        //Find no. of cols. in dynamic table 
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'sortable')]/tbody/tr[1]/td"));
        System.out.println("No. of columns in the Static table = " + cols.size());
        
        //Find no. of rows. in dynamic table 
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'sortable')]/tbody/tr"));
        System.out.println("No. of rows in the Static table = " + rows.size());
              
        //Find and print cell value of 2nd row and 2nd column
        System.out.println(driver.findElement(By.xpath("//table[contains(@class,'sortable')]/tbody/tr[2]/td[2]")).getText());;        
        
        //Click the header of the first column to sort by name 
        driver.findElement(By.xpath("//table[contains(@class,'sortable')]/thead/tr/th[1]")).click();
        
        //Find and print cell value of 2nd row and 2nd column again
        System.out.println(driver.findElement(By.xpath("//table[contains(@class,'sortable')]/tbody/tr[2]/td[2]")).getText());;        
        
        //Print the cell values of the table footer
        List<WebElement> footer = driver.findElements(By.xpath("//table[contains(@class,'sortable')]/tfoot/tr/th"));
        for(WebElement foot: footer) {
        	System.out.println(foot.getText());        
        } 
        
        //Close the browser
        driver.quit();
    }
}