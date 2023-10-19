package baseTest;
import com.rebud.utils.LocalStorage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;

public class BaseTest {
    protected static WebDriver driver ;

    protected void setupWebDriver(Browser browser){

        if (browser.equals(Browser.CHROME)){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browser.equals(Browser.EDGE)){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

    }
    public static void verifyAddress(WebDriver driver) throws InterruptedException {
        LocalStorage.addDataToLocalStorage(driver, "initial", "true");
        LocalStorage.addDataToLocalStorage(driver, "deliveryStatus", "\"ok\"");
        LocalStorage.addDataToLocalStorage(driver, "guId_www.rebud.com", "\"84aafffb-f8ba-4845-8c92-ec8fa4e5e263\"");
    }

    protected void goToStartPage(String startPage) {
    }
}
