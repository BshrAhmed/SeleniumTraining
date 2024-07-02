package ObjectsPath;

// Import necessary classes from Selenium
import org.openqa.selenium.By;


// Define the TestHome class
public class TestHome {

    // Locator for the login button in the home page
    public static final By loginBtnInHomePage = By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div/a");

    // Locator for the email address input field in the login form
    public static final By emailAddressLogin = By.xpath("//*[@id='login_field']");

    // Locator for the password input field in the login form
    public static final By passwordLogin = By.xpath("//*[@id='password']");

    // Locator for the sign in button in the login form
    public static final By signInBtn = By.xpath("//*[@id='login']/div[4]/form/div/input[13]");

    // Locator for an element to assert upon successful login
    public static final By assertionUponLogin = By.xpath("//*[@id='dashboard']/div/feed-container/div[1]/div/a");

}
