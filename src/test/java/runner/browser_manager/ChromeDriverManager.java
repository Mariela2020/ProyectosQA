package runner.browser_manager;


import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{

    @Override
    public void createDriver()  {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        driver =new ChromeDriver();

        //driver = new DriverBuilder<ChromeDriver>(new ChromeOptions())
         //       .withRemoteAddress(new URL("http://localhost:8585"))
         //       .withToken("wL7y50UMIvpsdJafvYzqycNQTWsXVydqahZXswK1M8E1")
         //       .build(ChromeDriver.class);

    }
}
