package pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginHomePage extends BasePage{


    public LoginHomePage(WebDriver driver) {
        super(driver);
    }

    String expected = null;
    String actual = null;

    @FindBy( id = "onesignal-slidedown-cancel-button")
    private WebElement btnmensaje;

    @FindBy(id = "btnLogin")
    private WebElement btnentrar;

    @FindBy(id = "IngresoUsuario.CorreoElectronico")
    private WebElement txtemailusuario;

    @FindBy(id = "IngresoUsuario.Contrasena")
    private WebElement txtpassword;

    @FindBy(xpath = "/html/body/div[3]/section/div/div/div[3]/form/div[4]/button")
    private WebElement btniniciar;

    @FindBy(className = "nom-user")
    private WebElement txtnomuser;
    private String nombreUser1 = "Mariela";

    public boolean istitleDisplayed() throws Exception {
        // expected = "TOCTOC.com:propiedades, casas y deptos. Asesórate antes de comprar";
        expected = "TOCTOC.com - Casas, Departamentos en Venta y Arriendo publicados en este portal inmobiliario";
        return this.getTitle().equals(expected);
    }


    public void CloseMens() throws InterruptedException {
        Thread.sleep(1000);
        btnmensaje.click();
        Thread.sleep(2000);
    }
    public void ClickEntrarLink()  {
        btnentrar.click();
    }

    public void EnterLogin(String userName, String password) {
        txtemailusuario.sendKeys(userName);
        txtpassword.sendKeys(password);
    }

    public void ClickIniciarBtn() throws InterruptedException {
        btniniciar.click();
        Thread.sleep(3000);
    }

    public boolean registroPageIsDisplayed() throws Exception {
        return this.isDisplayed(txtnomuser) && this.equals(nombreUser1);

    }
}
