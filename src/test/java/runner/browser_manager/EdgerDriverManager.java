package runner.browser_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgerDriverManager extends DriverManager  {


    @Override
    protected void createDriver() {

        System.setProperty("webdriver.edge.driver", "src/test/resources/edgedriver_win64/msedgedriver.exe");
        //System.setProperty("webdriver.edge.driver", "src/test/resources/edgerdriver/MicrosoftWebDriver.exe");
        //System.setProperty("webdriver.edge.driver", "C:\\Windows\\System32\\MicrosoftWebDriver.exe");
        driver = new EdgeDriver();

        }
}
