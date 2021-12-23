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

public class Activity92 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
              
        //Open the browser
        driver.get("https://www.training-support.net/selenium/selects");

        //Use findElement() to find the multi-select WebElement on the page
        WebElement multiSelect = driver.findElement(By.id("multi-select"));
        Select select = new Select(multiSelect);
        
        //Check if the HTML element is a multi-list. Proceed with other actions if it is
        if(select.isMultiple()) {
        	
        	//Select the 'JavaScript' option by visible text
        	select.selectByVisibleText("Javascript");
        	
            //Select the 'NodeJS' option by value
            select.selectByValue("node");
            
            //Select the 4th, 5th, and the 6th options by index
            select.selectByIndex(3);
            select.selectByIndex(4);
            select.selectByIndex(5);   
            
            //Deselect the 'NodeJS' option by value attribute
            select.deselectByValue("node");
            
            //Deselect the 7th option by index
            select.deselectByIndex(6);
            
            //Print the first selected option
            WebElement firstSelected = select.getFirstSelectedOption();
            System.out.println(firstSelected.getText());
            
            //Print all selected options one by one and deselect all options
        	List<WebElement> allSelected = select.getAllSelectedOptions();
        	
        	System.out.println("All selected options :-");
        	for(WebElement option: allSelected) {
        		System.out.println(option.getText());        
        	} 
        	
        	select.deselectAll();
        }
        
        //Close the browser
        driver.quit();
    }
}