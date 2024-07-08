package Base;
//Below are necessary for Selenium WebDriver operations.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
//Below are TestNg annotations.
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set ChromeDriver system property
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hpcom\\IdeaProjects\\SeleniumPilot\\drivers\\chromedriver.exe");

        // Initialize ChromeDriver instance
        driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        // Set implicit wait time for elements
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    @AfterClass
    public void tearDown() {
        // Close the browser and quit the WebDriver instance
        driver.quit();
    }
}

