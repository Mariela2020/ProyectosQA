package grid;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CrossBrowser {
    WebDriver driver;
    String baseUrl= "http://newtours.demoaut.com/index.php";
    String expected = null;
    String actual = null;
    WebDriverWait wait;
    //DesiredCapabilities capability=null;

    private void setProperties(String prop, String driverName) {
        System.setProperty("webdriver."+ prop + ".driver", System.getProperty("src/test/resources/chromedriver/chromedriver"+ driverName + ".exe"));
    }

    @BeforeTest
    @Parameters("browser")
    public void lauchBrowser(String browser) throws Exception{
        switch (browser.toUpperCase()) {
            case "CHROME":
                System.out.println("Chrome");
               // setProperties("chrome","chromedriver");
               // driver = new ChromeDriver();
                break;
            case "FIREFOX":
                System.out.println("firefox");
               // setProperties("gecko", "geckodriver");
               // driver = new FirefoxDriver();
                break;
            case "EDGE":
                System.out.println("Edge");
               // setProperties("edge","MicrosoftWebDriver");
               // driver = new EdgeDriver();
                break;
            /*case "EXPLORE":
                System.out.println("Iexplore");

                break;
            case "OPERA":
                System.out.println("Opera");
                break;*/
            default:
                //throw new Exception("Incorrect Browser");
                Assert.fail("Verify your browser selection");
                break;

        }

       // driver = new RemoteWebDriver(new URL(nodeUrl), capability);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @BeforeMethod
    public void verifityHomePageTitle() throws InterruptedException {
        expected = "Welcome:Mercury Tours";
        Thread.sleep(2000);
        actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void goBackToHomePage() {
        driver.findElement(By.linkText("Home")).click();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test(priority =1, enabled = true)
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


}
