package appiumProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TKActivity1 {
    WebDriverWait wait;
    AndroidDriver<MobileElement> driver = null;

    @BeforeTest
    public void setup() throws MalformedURLException {

        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testSearchAppium() {
        String task1 = "Complete Activity with Google Tasks";
        String task2 = "Complete Activity with Google Keep";
        String task3 = "Complete the second Activity Google Keep";

        //Add task 1
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.ImageButton")));
        driver.findElementById("tasks_fab").click();        
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.EditText")));
        driver.findElementById("add_task_title").sendKeys(task1);
        driver.findElementById("add_task_done").click();
        
        //Add task 2
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.ImageButton")));
        driver.findElementById("tasks_fab").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.EditText")));
        driver.findElementById("add_task_title").sendKeys(task2);
        driver.findElementById("add_task_done").click();
        
        //Add task 3
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.ImageButton")));
        driver.findElementById("tasks_fab").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.EditText")));
        driver.findElementById("add_task_title").sendKeys(task3);
        driver.findElementById("add_task_done").click();
        
        //Check if the tasks are successfully saved
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("task_name")));
        List<MobileElement> tasks = driver.findElementsById("task_name");
        Assert.assertEquals(tasks.get(0).getText(), task3);
        Assert.assertEquals(tasks.get(1).getText(), task2);
        Assert.assertEquals(tasks.get(2).getText(), task1);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}