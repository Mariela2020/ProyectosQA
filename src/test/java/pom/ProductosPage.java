package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductosPage extends BasePage {

   @FindBy(xpath="//*[@id=\"app\"]/div/div[3]/section[2]/a/div/h2")
    private WebElement imagenlocator;
    private String titlePage = "TOCTOC.com - Productos y servicios para Corredores de propiedades";

    @FindBy (xpath="//*[@id=\"vitrina_productos\"]/div/button[1]/div[2]/h4")
    private WebElement tarjetapropiedaddestacada;

    @FindBy (xpath = "//*[@id=\"vitrina_productos\"]/div/button[3]/div[2]/div/div[2]/a")
    private WebElement tarjetaapicontacto;

    @FindBy (xpath = "//*[@id=\"vitrina_productos\"]/div/button[1]/div[2]/div/div[2]/a")
    private  WebElement tarjetaUltimaventas;

    @FindBy (xpath="//*[@id=\"vitrina_productos\"]/div/button[5]/div[2]/div/div[2]/a")
    private WebElement tarjetabanner;

    @FindBy (xpath = "//*[@id=\"vitrina_productos\"]/div/button[4]/div[2]/div/div[2]/a")
    private WebElement tarjetapropiedaddestacada1;

    @FindBy (xpath="//*[@id=\"vitrina_productos\"]/div/button[6]/div[2]/div/div[2]/a")
    private WebElement tarjetaespaciolanding;


    @FindBy (xpath = "//*[@id=\"vitrina_productos\"]/div/button[7]/div[2]/div/div[2]/a")
    private WebElement tarjetamail500;

    @FindBy (xpath = "//*[@id=\"vitrina_productos\"]/div/button[8]/div[2]/div/div[2]/a")
    private WebElement Tarjetapropdestx5;

    @FindBy (xpath= "//*[@id=\"vitrina_productos\"]/div/button[9]/div[2]/div/div[2]/a")
    private WebElement tarjetapropdestx15;

    @FindBy (xpath= "//*[@id=\"vitrina_productos\"]/div/button[10]/div[2]/div/div[2]/a")
    private WebElement tarjetapropdestx30;

    @FindBy (xpath= "//*[@id=\"vitrina_productos\"]/div/button[11]/div[2]/div/div[2]/a")
    private WebElement tarjetapropdestx60;

    @FindBy (xpath= "//*[@id=\"vitrina_productos\"]/div/button[12]/div[2]/div/div[2]/a")
    private WebElement tarjetabanner5prop;

   //@FindBy (xpath="//*[@id=\"vitrina_productos\"]/div/button[1]/div[2]/h4")
    @FindBy (id = "msjCorredor")
    private WebElement productolocator;


    // @FindBy(linkText = "COMPRAR")
    @FindBy (css = "body > div.fade.modal.show > div > div > div.modal-footer > div:nth-child(2) > a")
    private WebElement btncomprar;

    public ProductosPage(WebDriver driver) {
        super(driver);
    }


    public boolean isImagenDisplayed() throws Exception {
        Thread.sleep(1000);
        return this.isDisplayed(imagenlocator) && this.getTitle().equals(titlePage);
    }

    public void clickOnTarjetaProducto() throws Exception {
        Thread.sleep(2000);
        this.click(tarjetapropdestx60);
     }

    public boolean isImagenDisplayed2() throws Exception {
        return this.isDisplayed(productolocator) && this.getTitle().equals(titlePage);
    }

    public void ClickOnComprar() throws Exception {
        Thread.sleep(2000);
        this.click(btncomprar);
    }


}
