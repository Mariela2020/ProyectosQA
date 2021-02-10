package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.browser_manager.*;
import utils.LogHelper;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Hooks {

    static WebDriver driver;
    WebDriverWait waitElement;

    String baseUrl= "https://ww2.toctoc.com/gestioncorredor/";
    //DesiredCapabilities capability=null;

    //  private static WebDriver driver;
    private static int numerOfCase = 0;
 //   private DriverManager driverManager;
    private static final Logger LOGGER = LogHelper.getLogger(Hooks.class);


    @Before("@browser")
    public void setup() throws IOException {

        numerOfCase ++;
        LOGGER.log(Level.INFO, "Generando reporte...");
     //   Properties properties = new Properties();
     //   properties.load(new FileReader("src/test/resources/config.properties"));
       // //properties.replace("driverManager_type","CHROME", "FIREFOX");
        //driverManager = DriverManagerFactory.getManager(DriverType.valueOf(properties.getProperty("driverManager_type")));
        //driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        DriverManagerFactory.getInstance().setDriver(DriverType.CHROME);

        driver = DriverManagerFactory.getInstance().getDriver();


        LOGGER.log(Level.INFO, "Test run:" + driver);
        //driver = driverManager.getDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.navigate().to("https://ww2.toctoc.com/gestioncorredor/");
       // driver.get("https://ww2.toctoc.com/gestioncorredor/");
      //  driver = new RemoteWebDriver(new URL(nodeUrl), capability);
        driver.get(baseUrl);
        waitElement = new WebDriverWait(driver,15);
       // driver.manage().window().maximize();

    }

    @After("@browser")
    public void tearDown(Scenario scenario)  {
         if(scenario.isFailed()) {
             LOGGER.log(Level.INFO, "Test run:");
            //byte[] screenshot = ((TakesScreenshot) driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
             byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshot, "image/png");
        }
           LOGGER.log(Level.INFO, "El escenario nro; " + numerOfCase + " se ejecuto correctamente.");
           //driver.quitDriver();
           DriverManagerFactory.getInstance().removeDriver();
    }

   //public static WebDriver getDriver(){
    //  return driver;
     //  return driver.get();
   // }

    public static WebDriver getDriver(){
        return driver;
        // return driver.get();
    }
}
