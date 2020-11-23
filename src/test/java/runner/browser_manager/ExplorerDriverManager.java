package runner.browser_manager;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class ExplorerDriverManager extends DriverManager {

     @Override
        public void createDriver() {

            //System.setProperty("webdriver.ie.driver","C:\\Users\\mhurtado\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver","src/test/resources/iedriver/IEDriverServer.exe");
            driver =new InternetExplorerDriver();

        }

}
