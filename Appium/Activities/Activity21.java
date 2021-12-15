package appiumTraining;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Activity21 extends Setup{
    @BeforeTest
    public void setup() throws MalformedURLException {
    	beforeClass("com.android.chrome", "com.google.android.apps.chrome.Main");
    }

    @Test
    public void testSearchAppium() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.training-support.net/");
        
        String pageTitle = driver.findElementByXPath("//*[@text='Training Support']").getText();
        System.out.println("Title on Homepage: " + pageTitle);


        MobileElement aboutButton = driver.findElementByXPath("//android.view.View[@content-desc='About Us']");
        aboutButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.className("android.view.View")));
        String newPageTitle = driver.findElementByXPath("//*[@text='About Us']").getText();

        System.out.println("Title on new page: " + newPageTitle);

        // Assertions
        Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");
    }

    @AfterTest
    public void tearDown(){
    	quit();
    }
}