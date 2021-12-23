package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;

public class Activity91 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
              
        //Open the browser
        driver.get("https://www.training-support.net/selenium/selects");
        
        //Use findElement() to find the dropdown WebElement on the page
        WebElement value = driver.findElement(By.id("single-value"));
        
        //Create a new Select class object with the WebElement
        WebElement dropdown = driver.findElement(By.id("single-select"));
        Select select = new Select(dropdown);
        
        //Select the second option using selectByVisibleText()
        select.selectByVisibleText("Option 2");
        //System.out.println(value.getText());
        System.out.println(select.getFirstSelectedOption().getText());
        
        //Select the third option using selectByIndex()
        select.selectByIndex(2);
        System.out.println(value.getText());
        
        //Select the fourth option using selectByValue()
        select.selectByValue("4");
        System.out.println(value.getText());
        	
        //get all the options in the dropdown and print them one by one
        List<WebElement> options = select.getOptions();
        
        System.out.println("Options available :-");
        for(WebElement option: options) {
        	System.out.println(option.getText());        
        } 
        
        //Close the browser
        driver.quit();
    }
}