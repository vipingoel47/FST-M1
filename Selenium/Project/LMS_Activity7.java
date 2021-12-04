package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;

public class LMS_Activity7 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void numberofCourses() {
    	// Select the menu item that says “All Courses” and click it
        driver.findElement(By.xpath("//a[text()='All Courses']")).click();
            
        //Find all the courses on the page and print the number
        System.out.println("No. of Courses = " + driver.findElements(By.xpath("//div[@class='ld-course-list-items row']/div")).size());
        
        //close browser;
        driver.quit();
        
    }
}