package testNG;

import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.testng.SkipException;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;

public class Activity5 {
    WebDriver driver;
    
    @BeforeTest(alwaysRun = true)
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test (groups = {"HeaderTests", "ButtonTests"})
    public void pageTitleTest() {
    	// Check the title of the page
        String title = driver.getTitle();
            
        //Assertion for page title
        Assert.assertEquals("Target Practice", title);
        
    }
    
    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
    public void header3() {
        //Find 3rd header its text
        WebElement header3 = driver.findElement(By.xpath("//h3[@id='third-header']"));
        Assert.assertEquals(header3.getText(), "Third header");
       
    }
    
    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
    public void header5() {
        //Find 5th header and its color
        WebElement header5 = driver.findElement(By.xpath("//h5[@class='ui green header']"));
    	Assert.assertEquals(header5.getCssValue("color"), "rgb(33, 186, 69)");
    	
    }
    
    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
    public void button1() {
        //Find 3rd header its text
        WebElement button1 = driver.findElement(By.xpath("//button[@class='ui olive button']"));
        Assert.assertEquals(button1.getText(), "Olive");
       
    }
    
    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
    public void button2() {
        //Find 5th header and its color
        WebElement button2 = driver.findElement(By.xpath("//button[@class='ui brown button']"));
        Assert.assertEquals(button2.getText(), "Brown");
        
    }

    @AfterTest (alwaysRun = true)
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}