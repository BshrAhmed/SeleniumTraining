package Pages;

// Import necessary classes from Selenium and TestNG
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static ObjectsPath.TestHome.*; // Import all static fields (locators) from TestHome class

// Define the TestPages class
public class TestPages {
    WebDriver driver = null; // Declare WebDriver instance variable

    // Constructor to initialize WebDriver instance
    public TestPages(WebDriver driver) {
        this.driver = driver; // Assign WebDriver instance from parameter to local driver variable
    }

    // Method to open GitHub homepage
    public void OpenGitHubUrl (){
        driver.get("https://github.com/"); // Navigate to GitHub URL
    }

    // Method to click on the login button on the home page
    public void LoginHomePageMethod() {
        WebElement loginPage = driver.findElement(loginBtnInHomePage); // Find login button element
        loginPage.click(); // Click on the login button
    }

    // Method to enter login credentials and verify login
    public void EnterLoginCredentials () throws InterruptedException {
        driver.findElement(emailAddressLogin).sendKeys("bshrr92@gmail.com"); // Find email address field and enter email
        Thread.sleep(3000); // Pause execution for 3000 milliseconds (not recommended; use explicit waits instead)
        driver.findElement(passwordLogin).sendKeys("090908?"); // Find password field and enter password
        driver.findElement(signInBtn).click(); // Click on sign-in button

        boolean homepageview = driver.findElement(assertionUponLogin).isDisplayed(); // Check if assertion element is displayed
        Assert.assertTrue(homepageview, "home page is not displayed!"); // Assert that homepageview is true
    }
}
