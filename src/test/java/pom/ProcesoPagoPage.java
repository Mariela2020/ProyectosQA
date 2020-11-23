package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProcesoPagoPage extends BasePage {


    public ProcesoPagoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/h1")
    private WebElement titleprocesopago;
    private String titlePage28 = "Pago Seguro WebPay";


    @FindBy(className = "form-control number ")
    private By nrotarjeta;

    @FindBy(id = "inputGroupSelectMonth")
    private WebElement mesexpiracion;

    @FindBy(id = "inputGroupSelectYear")
    private WebElement yearexpiracion;

    @FindBy(className = "form-control cvv ")
    private By nrocvv;

    @FindBy(linkText = "Cambiar el método de pago")
    private WebElement cambiarpago;

    @FindBy(className = "btn-pagar")
    //@FindBy (linkText = "Pagar")
    private WebElement btnpagar;

    public boolean istitleprocesopagoDisplayed() throws Exception {
        Thread.sleep(2000);
        return this.isDisplayed(titleprocesopago) && this.getTitle().equals(titlePage28);
    }

    public void typeDatostarjeta() throws Exception {
        type("3456789867544456", By.id("form-control number "));
    }

    public String selectDropdownListMes() throws Exception {
        Select selectList_mes = new Select(mesexpiracion);
        selectList_mes.selectByVisibleText("12");
        return getText(selectList_mes.getFirstSelectedOption());
    }

    public String selectDropdownListYear() throws Exception {
        Select selectList_year = new Select(yearexpiracion);
        selectList_year.selectByVisibleText("21");
        return getText(selectList_year.getFirstSelectedOption());
    }

    public void typeDatostarjeta1() throws Exception {
        type("123", By.id("form-control cvv "));
    }

  //  public void ClickOnpagar() throws Exception {
   //     this.click(btnpagar);
   // }
}

