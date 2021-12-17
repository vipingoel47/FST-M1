package appiumProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Chrome1 {
    AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 25);

        driver.get("https://www.training-support.net/selenium");
    }

    @Test
    public void toDoList() {
    	
    	//Define list of tasks to be added (includes default task)
    	ArrayList<String> tasks = new ArrayList<String>();
    	tasks.add("Add more tasks to this list."); //Default task
    	tasks.add("Add tasks to list");
    	tasks.add("Get number of tasks");
    	tasks.add("Clear the list");
    	
    	String UIScrollable = "UiScrollable(UiSelector().scrollable(true))";
        
    	// wait for page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[@text='Selenium']")));

        //Scroll to find the To-Do List card and click it
        MobileElement toDoList = driver.findElement(MobileBy.AndroidUIAutomator(UIScrollable + ".scrollTextIntoView(\"To-Do List\")"));
        toDoList.click();
        
        //Once the page loads, find the input field on the page and enter the following three tasks:
        //i.	Add tasks to list
        //ii.	Get number of tasks
        //iii.	Clear the list
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[@text='Add Task']")));
        MobileElement taskInput = driver.findElementByClassName("android.widget.EditText");
        MobileElement addTask = driver.findElementByXPath("//*[@text='Add Task']");
        taskInput.sendKeys(tasks.get(1));
        addTask.click();
        taskInput.sendKeys(tasks.get(2));
        addTask.click();
        taskInput.sendKeys(tasks.get(3));
        addTask.click();
        
        //Click on each of the tasks added to strike them out
        MobileElement taskList = driver.findElementByXPath("//android.view.View[@resource-id='tasksList']");
        List<MobileElement> addedTasks = taskList.findElementsByClassName("android.widget.TextView");
        int i=0;
        for(MobileElement task : addedTasks) {
        	Assert.assertEquals(task.getText(), tasks.get(i));
        	task.click();
        	System.out.println(task.getText());
        	i++;
        }
        
        //Finally, clear the list
        MobileElement clearList = driver.findElementByXPath("//android.view.View/android.view.View/android.view.View[3]/android.widget.TextView[2]");
        clearList.click();
        
        //Verify there are no tasks left after clearing the list
        boolean taskListStatus = driver.findElementByXPath("//android.view.View[@resource-id='tasksList']").isDisplayed();
        Assert.assertEquals(taskListStatus, false);
    }

    @AfterClass
    public void afterClass() {
        //driver.quit();
    }
}