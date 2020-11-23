package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;
import utils.LogHelper;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Hooks {

    private static WebDriver driver;
    private static int numerOfCase = 0;
    private DriverManager driverManager;
    private static final Logger LOGGER = LogHelper.getLogger(Hooks.class);

    @Before("@browser")
    public void setup() throws IOException {

        numerOfCase ++;
        LOGGER.log(Level.INFO, "Generando reporte...");
        Properties properties = new Properties();
        properties.load(new FileReader("src/test/resources/config.properties"));
        driverManager = DriverManagerFactory.getManager(DriverType.valueOf(properties.getProperty("driverManager_type")));
        //driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        LOGGER.log(Level.INFO, "Test run:" + driverManager);
        driver = driverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.navigate().to("https://ww2.toctoc.com/gestioncorredor/");
        driver.get("https://ww2.toctoc.com/gestioncorredor/");
        driver.manage().window().maximize();
    }

    @After("@browser")
    public void tearDown(Scenario scenario)  {
         if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
           LOGGER.log(Level.INFO, "El escenario nro; " + numerOfCase + " se ejecuto correctamente.");
           driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }





}
