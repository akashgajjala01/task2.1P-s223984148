package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 * Automates registration page testing using Selenium WebDriver.
 * This script:
 * - Opens Officeworks registration page
 * - Locates input fields by ID
 * - Fills in personal information
 * - Clicks "Create Account"
 * - Takes a screenshot if validation fails
 */
public class SeleniumOperations {

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void officeworks_registration_page(String url) {
        // Set ChromeDriver path (Make sure chromedriver.exe is inside this folder)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91709\\OneDrive\\Desktop\\707\\cromedriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        System.out.println("Opened Chrome Browser");
        driver.get(url);

        try {
            // Locate input fields and enter values
            driver.findElement(By.id("firstname")).sendKeys("Akash");
            driver.findElement(By.id("lastname")).sendKeys("TestUser");
            driver.findElement(By.id("email")).sendKeys("testemail@example.com");
            driver.findElement(By.id("phone")).sendKeys("0123456789");
            driver.findElement(By.id("password")).sendKeys("123"); // Weak password to trigger error

            // Click 'Create Account' button
            WebElement createAccountBtn = driver.findElement(By.xpath("//button[contains(text(), 'Create Account')]"));
            createAccountBtn.click();

            sleep(3); // Wait for errors to load

            // Ensure Screenshots directory exists
            File screenshotDir = new File("Screenshots");
            if (!screenshotDir.exists()) {
                screenshotDir.mkdir();
            }

            // Take a screenshot
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("Screenshots/officeworks_registration.png"));
            System.out.println("Screenshot saved: Screenshots/officeworks_registration.png");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }

    public static void main(String[] args) {
        officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
    }
}
