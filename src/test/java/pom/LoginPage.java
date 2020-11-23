package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//*[@id=\'app\']/div/div/div[1]/img")
    private WebElement registerPageLocator;
    private String titlePage7 = "TOCTOC.com Gestión Corredoras";

    @FindBy(id = "email")
    private By emailLocator;

    @FindBy(name ="password")
    private By passwordLocator;

    //@FindBy(xpath = "//*[@id='loginForm']/div[4]/button")
    @FindBy(xpath="//*[@id=\"loginForm\"]/div/div[3]/button/span")
    private WebElement btningresar;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isImagenDisplayed3() throws Exception {
        Thread.sleep(5000);
        return this.isDisplayed(registerPageLocator) && this.getTitle().equals(titlePage7);
    }

    public void typeEmailLocator() throws Exception {
        clear(" ", By.id("email"));
       // type("glori.sierra@hotmail.com", By.id("email"));
        type("hurtadomariela2@gmail.com", By.id("email"));
     }

    public void typePasswordLocator() throws Exception {

        clear(" ", By.name("password"));
        Thread.sleep(2000);
       // type("cuchufi",By.name("password"));
        type("prueba",By.name("password"));
    }

    public void ClickOnIngresar() throws Exception {
        this.click(btningresar);
    }


}
