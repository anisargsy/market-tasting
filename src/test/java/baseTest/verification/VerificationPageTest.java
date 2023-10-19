package baseTest.verification;

import baseTest.BaseTest;
import com.rebud.driver.DriverManager;
import com.rebud.pages.verification.VerificationPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.rebud.pages.BasePage.startPage;
import static java.lang.Thread.sleep;


public class VerificationPageTest extends BaseTest {
     @Test(priority = 1)
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = DriverManager.getDriver();
        VerificationPage verificationPage = new VerificationPage(driver);
        driver.manage().window().maximize();
        driver.get(startPage);


        //Verify that Verification page is visible successfully
        boolean equalsUrl;
        equalsUrl = VerificationPage.equalsCurrentURL(startPage);
        if (equalsUrl) {
            System.out.println("Verification page is visible");
        } else {
            System.out.println("Verification page is not visible");
        }

        //Verify Logo
        if (verificationPage.logoIsVisible()) {
            System.out.println("Logo is Visible");

        } else {
            System.out.println("Logo is not visible");
        }

        //Verify 'HIGH BUD' is visible
        if (verificationPage.textHIGHBUD1IsVisible()) {
            System.out.println("HIGH BUD");
        } else {
            System.out.println("'HIGH BUD' is not visible");
        }


        //Verify 'Where should we deliver your stuff?' is visible
        if (verificationPage.textHIGHBUD2IsVisible()) {
            System.out.println("Where should we deliver your stuff?");
        } else {
            System.out.println("Where should we deliver your stuff? is not visible ");
        }


//        //Enter location
        verificationPage.enterLocation.sendKeys("820 Main Street, Los Angeles, CA, USA");
        sleep(2000);
        verificationPage.enterLocation.sendKeys(Keys.ARROW_DOWN);
        verificationPage.enterLocation.sendKeys(Keys.ENTER);
//        sleep(2000);
        //Verify 'WE GOTTA ASK' is visible
        if (verificationPage.textHIGHBUD3IsVisible()) {
            System.out.println("WE GOTTA ASK");
        } else {
            System.out.println("'WE GOTTA ASK' is not visible ");
        }

        //Verify 'Are you 21+? or 18+ with a medical card?' is visible
        if (verificationPage.textHIGHBUD4IsVisible()) {
            System.out.println("Are you 21+? or 18+ with a medical card?");
        } else {
            System.out.println("Are you 21+? or 18+ with a medical card? is not visible");
        }

        sleep(1000);

        //Click on 'YEs' button
        verificationPage.yesButton().click();
        verificationPage.closeDriver();
    }
}


