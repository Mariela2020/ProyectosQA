package runner.browser_manager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{

    @Override
    public void createDriver() {

        //System.setProperty("webdriver.gecko.driver","C:\\Users\\mhurtado\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");
        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver/geckodriver.exe");
        driver =new FirefoxDriver();

    }
}
