package Utils;

import Utils.AutomationConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    public static WebDriver getDriver(){return driver;}

    @BeforeClass
    public static void openBrowser()
    {
        System.out.println("starting the browser");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(AutomationConstants.URL);//open
        //for set TIMEOUT
        driver.manage().timeouts().implicitlyWait(AutomationConstants.MAX_TIMEOUTS, TimeUnit.SECONDS);
    }


    @AfterClass
    public static void closeBrowser()
    {
        System.out.println("closing Browser");
        driver.quit();
    }
}
