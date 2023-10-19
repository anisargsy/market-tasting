package baseTest.login;

import baseTest.BaseTest;
import com.rebud.driver.DriverManager;
import com.rebud.pages.login.RedirectToLoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.rebud.pages.BasePage.startPage;

public class RedirectToLoginPageTest extends BaseTest {
    @Test(priority = 2)
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getDriver();
        RedirectToLoginPage redirect = new RedirectToLoginPage(driver);
        driver.manage().window().maximize();

        driver.get(startPage);
        verifyAddress(driver);
        driver.get(startPage);



        redirect.ClickOnUserIcon();
        redirect.ClickOnLoginLink();
        redirect.closeDriver();


    }


}
