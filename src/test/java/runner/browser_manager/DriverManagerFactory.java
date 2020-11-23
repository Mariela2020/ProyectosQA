package runner.browser_manager;


import java.util.Properties;

public class DriverManagerFactory {

   // public static DriverManager getManager(DriverType type){


    public static DriverManager getManager(DriverType type){
        DriverManager driverManager = null;

        switch (type){
            case CHROME:
                driverManager  = new ChromeDriverManager();
                break;

            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;

            case EXPLORER:
                 driverManager = new ExplorerDriverManager();
                 break;

            case EDGER:
                 driverManager = new EdgerDriverManager();
                 break;

            case OPERA:
                 driverManager = new OperaDriverManager();
                 break;

                default:
                System.out.println("Invalid browse selected");
                break;
        }

         return driverManager;


    }
}
