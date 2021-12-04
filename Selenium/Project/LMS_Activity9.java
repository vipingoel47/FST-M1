package testNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;

public class LMS_Activity9 {
	WebDriver driver;

	String username = "root";
	String password = "pa$$w0rd";

	@BeforeMethod
	public void beforeMethod() {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();

		// Open browser
		driver.get("https://alchemy.hguy.co/lms");
		driver.findElement(By.xpath("//a[text()='My Account']")).click();

		// Click on login button, enter credentials and login
		driver.findElement(By.xpath("//a[contains(@class,'ld-login')]")).click();
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
	}

	@Test
	public void numberofCourses() {
		// Select the menu item that says “All Courses” and click it
		driver.findElement(By.xpath("//a[text()='All Courses']")).click();

		// Select any course and open it
		driver.findElement(By.xpath("//div[@class='ld-course-list-items row']/div[1]")).click();

		// Click on a lesson in the course. Verify the title of the course
		WebElement lesson = driver.findElement(By.xpath("//*[@id='ld-item-list-69']/div[1]/div[1]/a/div[2]"));

		String lessonText = lesson.getText();
		String[] lessonTextArray = lessonText.split("\\n");
		String lessonSelected = lessonTextArray[0];

		lesson.click();
		driver.getTitle();

		// Assertion for title of lesson page
		try {
			Assert.assertTrue(driver.getTitle().contains(lessonSelected));
			System.out.println("Title of the lesson page is correct: " + driver.getTitle());
		} catch (AssertionError e) {
			System.out.println("Title is incorrect: " + driver.getTitle());
			System.out.println("Expected Title should contain: " + lessonSelected);
			driver.quit();
			throw e;
		}
		
		//Click the Mark Complete button on the page (if available)
		List<WebElement> markCompleteButtons = driver.findElements(By.xpath("//*[contains(text(),'Mark Complete')]"));

		if(markCompleteButtons.size() > 0) 
			markCompleteButtons.get(0).click();
		else 
			System.out.println("'Mark Complete' button is not available");
		 
		// close browser;
		driver.quit();

	}
}