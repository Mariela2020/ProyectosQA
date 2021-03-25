package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.LogHelper;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DetalleContratoPage extends BasePage {

    private static final Logger LOGGER = LogHelper.getLogger(DetalleContratoPage.class);
    public DetalleContratoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@id=\"app\"]/div/div[4]/section/div/div[1]/h3[1]")
    private WebElement titledetalleContrato;
    private String titlePage26 = "TOCTOC.com Gestión Corredoras";


    @FindBy (xpath = "/html/body/div/div/div/div/div/div[2]/div[2]/div[3]/div[2]/p")
    private WebElement resultotaltext;

    @FindBy (xpath = "/html/body/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/h2")
    private WebElement preciotext;

    @FindBy (xpath="/html/body/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]/h2")
    private WebElement ivatext;

    @FindBy (xpath = "/html/body/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[1]/p[2]")
    private WebElement productotext;

    @FindBy (xpath = "//*[@id=\"app\"]/div/div[4]/section/div/div[4]/div/a")
    private WebElement btnPagar;

    public boolean istitledetalleDisplayed() throws Exception {
        Thread.sleep(2000);
        return this.isDisplayed(titledetalleContrato) && this.getTitle().equals(titlePage26);
    }

    public void WriteExcelFile() throws Exception {
        String filepath = "src/test/resources/filepath/Test2.xlsx";
        String date = getDate();
        String precio= getText(preciotext);
        String iva= getText(ivatext);
        String producto= getText(productotext);
        String resultText= getText(resultotaltext);
        LOGGER.log(Level.INFO, "El valor total del Producto es: " +producto + "  "+ resultText);
        readExcel(filepath, "Hoja1");
        writeExcel(filepath,"Hoja1", producto +";  " + precio + ";  " + iva + ";  " + resultText + ";  " + date);
        readExcel(filepath,"Hoja1");
    }

    public void ClickOnbtnPagar() throws Exception {
        Thread.sleep(2000);
        this.click(btnPagar);
    }

}

