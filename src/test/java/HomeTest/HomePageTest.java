package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {


    @Test
    public void HomePageLoginMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenGitHubUrl();
        homepage.LoginHomePageMethod();
        homepage.EnterLoginCredentials();

    }
}




