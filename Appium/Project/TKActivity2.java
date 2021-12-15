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

public class TKActivity2 {
    WebDriverWait wait;
    AndroidDriver<MobileElement> driver = null;

    @BeforeTest
    public void setup() throws MalformedURLException {

        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testSearchAppium() {
        String title = "Test Appium";
        String  note = "Test";
        
        //Add a note
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.ImageButton")));
        driver.findElementById("new_note_button").click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.widget.EditText")));
        driver.findElementById("editable_title").click();
        driver.findElementById("editable_title").sendKeys(title);
        driver.findElementById("edit_note_text").click();
        driver.findElementById("edit_note_text").sendKeys(note);
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
        
        //Check if the note is successfully saved
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("index_note_title")));
        List<MobileElement> titles = driver.findElementsById("index_note_title");
        List<MobileElement> notes = driver.findElementsById("index_note_text_description");
        Assert.assertEquals(titles.get(0).getText(), title);
        Assert.assertEquals(notes.get(0).getText(), note);
    }

    @AfterTest
    public void tearDown() {
        //	driver.quit();
    }
}