package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.LogHelper;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DetalleContratoPlan extends BasePage{

    private static final Logger LOGGER = LogHelper.getLogger(DetalleContratoPlan.class);

    public DetalleContratoPlan(WebDriver driver) {
        super(driver);
    }

    //@FindBy(linkText = "verDetalle")
    @FindBy(xpath="//*[@id=\"verDetalle\"]")
    private WebElement linkverdetalle;

    //@FindBy (css ="div.row:nth-child(1) > h3:nth-child(1)")
    @FindBy (xpath = "//*[@id=\"app\"]/div/div[4]/section/div/div[1]/h3[1]")
    private WebElement detallecontrato;
    private String titlePage5 = "TOCTOC.com Gestión Corredoras";

    @FindBy (xpath = "/html/body/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[1]/p[2]")
    private WebElement productotxt;

    @FindBy (xpath="/html/body/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/h2")
    private WebElement preciotxt;

    @FindBy(xpath = "/html/body/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]/h2")
    private WebElement ivatxt;

    //@FindBy (xpath="//*[@id=\"app\"]/div/div[4]/section/div/div[4]/div[4]/div/div[2]/span")
    @FindBy (xpath="/html/body/div/div/div/div/div/div[2]/div[2]/div[3]/div[2]/p/strong")
    private WebElement resultotaltext1;

       @FindBy (xpath = "/html/body/div[3]/div/div/div[3]/a")
    private WebElement btnmensaje;

    @FindBy (xpath = "//*[@id=\"app\"]/div/div[4]/section/div/div[5]/div/a")
    private WebElement btnpagarplan;


    public boolean istitledetalleDisplayed9() throws Exception {
         Thread.sleep(2000);
         return this.isDisplayed(detallecontrato) && this.getTitle().equals(titlePage5);
         }

    public void ClickOnlinkverdetalle() throws Exception {
        Thread.sleep(2000);
        this.click(linkverdetalle);
    }

    public void WriteExcelFile1() throws Exception {
        String filepath = "src/test/resources/filepath/Test2.xlsx";
        String date = getDate();
        String producto= getText(productotxt);
        String precio= getText(preciotxt);
        String iva= getText(ivatxt);
        String resultText= getText(resultotaltext1);
        LOGGER.log(Level.INFO, "El valor total del Plan es:"+ producto + "  " + resultText);
        readExcel(filepath, "Hoja1");
        writeExcel(filepath,"Hoja1", producto + ";  " + precio +";  " + iva +";  " + resultText + ";  " + date);
        readExcel(filepath,"Hoja1");
    }

    public void ClickOnbtnPagar() throws Exception {
        Thread.sleep(2000);
        this.click(btnpagarplan);
     }

    public void ClickOnbtnmensaje() throws Exception {
        this.click(btnmensaje);
    }

}
