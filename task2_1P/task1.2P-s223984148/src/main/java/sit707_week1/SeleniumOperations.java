package sit707_week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

/**
 */
public class SeleniumOperations {
	
    // Sleep helper method
    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void open_chrome_and_close() {
        // Step 1: Locate Chrome driver folder in the local drive.
        System.setProperty("webdriver.chrome.driver", "C:/Users/91709/OneDrive/Desktop/707/cromedriver/chromedriver-win64/chromedriver.exe");

        // Step 2: Use above Chrome driver to open up a Chromium browser.
        System.out.println("Fire up Chrome browser.");
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver info: " + driver);

        sleep(5);

        // Close Chrome driver. You can comment below line to keep the browser opened.
        driver.close();
    }

    public static void open_chrome_maximize_close() {
        // Step 1: Locate Chrome driver folder in the local drive.
        System.setProperty("webdriver.chrome.driver", "C:/Users/91709/OneDrive/Desktop/707/cromedriver/chromedriver-win64/chromedriver.exe");

        // Step 2: Use above Chrome driver to open up a Chromium browser.
        System.out.println("Fire up Chrome browser.");
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver info: " + driver);

        sleep(5);

        // Maximize Chrome driver
        driver.manage().window().maximize();
        System.out.println("Browser window maximized.");

        sleep(5);

        // Close Chrome driver.
        driver.close();
    }

    public static void load_web_page_close() {
        // Step 1: Locate Chrome driver folder in the local drive.
        System.setProperty("webdriver.chrome.driver", "C:/Users/91709/OneDrive/Desktop/707/cromedriver/chromedriver-win64/chromedriver.exe");

        // Step 2: Use above Chrome driver to open up a Chromium browser.
        System.out.println("Fire up Chrome browser.");
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver info: " + driver);

        sleep(5);

        // Open the Selenium official webpage
        driver.get("https://selenium.dev");
        System.out.println("Selenium website loaded.");

        sleep(5);

        // Close Chrome driver.
        driver.close();
    }

    /*
     * Task: Complete this function as per the requirements.
     */
    public static void open_chrome_loadpage_resize_close() {
        // Step 1: Fill your personal information.
        System.out.println("Hello from S223984148, Akash Reddy");

        // Step 2: Locate Chrome driver folder in the local drive.
        System.setProperty("webdriver.chrome.driver", "C:/Users/91709/OneDrive/Desktop/707/cromedriver/chromedriver-win64/chromedriver.exe");

        // Step 3: Use above Chrome driver to open up a Chromium browser.
        System.out.println("Fire up Chrome browser.");
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver info: " + driver);

        sleep(2);

        // Step 4: Load Google page.
        driver.get("https://www.google.com");
        System.out.println("Google page loaded.");

        // Step 5: Set window size manually to 640x480 and wait 2 seconds.
        driver.manage().window().setSize(new Dimension(640, 480));
        System.out.println("Resized to 640x480.");
        sleep(2);

        // Step 6: Double the window size to 1280x960 and wait 2 seconds.
        driver.manage().window().setSize(new Dimension(1280, 960));
        System.out.println("Resized to 1280x960.");
        sleep(2);

        // Step 7: Close the Chrome browser.
        driver.close();
        System.out.println("Chrome browser closed.");
    }
}