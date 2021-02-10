package grid;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.URL;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class GridTest {
    WebDriver driver;
    String baseUrl= "https://ww2.toctoc.com/gestioncorredor/";
    String expected = null;
    String actual = null;
    WebDriverWait wait;
    DesiredCapabilities capability=null;

    @BeforeTest
    @Parameters({"browser", "nodeUrl"})
    public void lauchBrowser(String browser, String nodeUrl) throws Exception{
        switch (browser.toUpperCase()) {
            case "CHROME":
                //System.out.println("Chrome");
                capability = DesiredCapabilities.chrome();
                capability.setBrowserName("chrome");
                capability.setPlatform(Platform.ANY);
                break;
            case "FIREFOX":
               // System.out.println("firefox");
                capability = DesiredCapabilities.firefox();
                capability.setBrowserName("firefox");
                capability.setPlatform(Platform.ANY);
                break;
            case "EDGE":
                //System.out.println("Edge");
                capability = DesiredCapabilities.edge();
                capability.setBrowserName("MicrosoftEdge");
                capability.setPlatform(Platform.WINDOWS);
                break;
            case "EXPLORE":
                System.out.println("Iexplore");
                capability = DesiredCapabilities.internetExplorer();
                capability.setBrowserName("Internet Explorer");
                capability.setPlatform(Platform.WINDOWS);
                break;
            case "OPERA":
                System.out.println("Opera");
                capability = DesiredCapabilities.opera();
                capability.setBrowserName("opera");
                capability.setPlatform(Platform.WINDOWS);

                break;
            case "SAFARI":
                System.out.println("Safari");
                capability = DesiredCapabilities.safari();
                capability.setBrowserName("safari");
                capability.setPlatform(Platform.IOS);
                break;
            default:
                //throw new Exception("Incorrect Browser");
                Assert.fail("Verify your browser selection");
                break;
        }

        driver = new RemoteWebDriver(new URL(nodeUrl), capability);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @BeforeMethod
    public void verifityHomePageTitle() throws InterruptedException {
        expected = "TOCTOC.com - Gestión corredor - Planes de publicación";
        Thread.sleep(2000);
        actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
    }

 //   @AfterMethod
 //   public void goBackToHomePage() {
//        driver.findElement(By.linkText("Home")).click();
//    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

 /*   @Test(priority =1, enabled = true)
    public void register() throws InterruptedException {
        driver.findElement(By.linkText("REGISTER")).click();
        expected = "Register: Mercury Tours";
        wait.until(ExpectedConditions.titleIs("Register: Mercury Tours"));
        actual = driver.getTitle();
        Assert.assertEquals(actual,expected);
    }

    @Test(priority = 0, enabled = true)
    public void support() throws InterruptedException {
        driver.findElement(By.linkText("SUPPORT")).click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        expected = "Under Construction: Mercury Tours";
        wait.until(ExpectedConditions.titleIs("Under Construction: Mercury Tours"));
        actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
    }

*/
}
