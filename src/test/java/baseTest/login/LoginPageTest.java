package baseTest.login;

import baseTest.BaseTest;
import com.rebud.driver.DriverManager;
import com.rebud.pages.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class LoginPageTest extends BaseTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = DriverManager.getDriver();
        LoginPage login = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.get("https://rebud.ifixgroup.com");
        verifyAddress(driver);
        driver.get("https://rebud.ifixgroup.com/login");

        sleep(1000);


        //Verify 'Login' is visible
        if (login.loginTextIsVisible()) {
            System.out.println(" Log In is visible ");

        } else {
            System.out.println("Log In is not visible");
        }
//
//
        //Enter valid Phone Number or Email
        login.usernameInput("ani@logickit.io");

        //Enter valid Password
        login.passwordInput("123123123");

        //Click Log In button
        login.clickOnLoginButton();


    }


}