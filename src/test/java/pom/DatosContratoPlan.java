package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DatosContratoPlan extends BasePage{

    public DatosContratoPlan(WebDriver driver) {
        super(driver);
    }

    //@FindBy (xpath = "//*[@id=\"datosContrato\"]/div[1]/h3[2]")
    @FindBy(css = "#datosContrato > div.row.title.d-flex.justify-content-between > h3:nth-child(2)")
    private WebElement pasounodetres;
    private String titlePage33 = "TOCTOC.com Gestión Corredoras";

    @FindBy (xpath = "//*[@id=\"datosContrato\"]/div[2]/div[1]/div[2]/input")
    private WebElement radiopersona;

    @FindBy (xpath="//*[@id=\"containFactura\"]/div[1]/span")
    private WebElement radiofactura;

    @FindBy (xpath = "//*[@id=\"containFactura\"]/div[2]/input" )
    private WebElement radioboleta;

    @FindBy (id = "\"razonSocial\"")
    private By razonsocial;

    @FindBy (id = "rutFacturacion")
    private By rutFacturacion;

    @FindBy (id = "nombreFantasia")
    private By nombreFantasia;

    @FindBy (id = "giro")
    private By giro;

    @FindBy (id = "telefono")
    private By telefono;

    @FindBy (id = "logoFile")
    private By logoFile;
    //private WebElement logoFile;

    @FindBy (id = "nextStep")
    private WebElement botonsiguiente;

    @FindBy (id = "//*[@id=\\\"datosFactura\\\"]/div[1]/h3[2]")
   // @FindBy (xpath = "//*[@id=\\\"datosFactura\\\"]/div[1]/h3[2]")
    private By pasodosdetres;

    @FindBy (id = "nombreContacto")
    private By nombrecontacto;

    @FindBy (id = "nombreFantasia")
    private By nombrefantasia;

    @FindBy (id = "rutRepresentanteLegal")
    private By rutrepresentantelegal;

    @FindBy (id = "emailContacto")
    private By emailcontacto;

    @FindBy (id = "direccion")
    private By direccion;

    @FindBy (id = "region")
    private WebElement dropdownList_region;

    @FindBy (id = "//*[@id=\\\"region\\\"]/option[14]")
    private By seleccionregion;

    @FindBy (id = "comuna")
    private WebElement dropdownList_comuna;

    @FindBy (id = "\"//*[@id=\\\"comuna\\\"]/option[26]\"")
    private By seleccioncomuna;

    @FindBy (id = "sameData")
    private By samedata;

    @FindBy (id = "aceptaTerminos")
    private WebElement aceptaTerminos;

    @FindBy (xpath = "//*[@id=\"datosFactura\"]/div[4]/div/button[2]")
    private WebElement botonenviar;

  //  public boolean isImagenDisplayed4() throws Exception {
  //      return this.isDisplayed(titleingresodatos) && this.getTitle().equals(titlePage8);
   // }

    public boolean isImagenDisplayed8() throws Exception {
        return this.isDisplayed(pasounodetres) && this.getTitle().equals(titlePage33);
    }


     public void typeDatosContratosplanpaso1() throws Exception {
        Thread.sleep(1000);
        this.click(radiopersona);
        // this.click(radiofactura);
        this.click(radioboleta);
        //Thread.sleep(1000);
        type("Prueba de Flujo plan", By.id("razonSocial"));
        type("267008469", By.id("rutFacturacion"));
        type("Tuinmueble plan", By.id("nombreFantasia"));
        type("Giro 3", By.id("giro"));
        type("+56955167469", By.id("telefono"));
       // type("C:\\Users\\dabarzua\\Downloads\\TI\\qrcode.png", By.id("logoFile"));
        this.click(botonsiguiente);
    }

    public void typeDatosContratosplanpaso2() throws Exception {
        type("Mariela Hurtado", By.id("nombreContacto"));
        type("267008469", By.id("rutRepresentanteLegal"));
        type("mariela.hurtado@toctoc.com", By.id("emailContacto"));
        type("Ohiggins", By.id("direccion"));

    }

    public String selectDropdownList2() throws Exception {
        Thread.sleep(1000);
        Select selectList_region = new Select(dropdownList_region);
        selectList_region.selectByVisibleText("Metropolitana");
        return getText(selectList_region.getFirstSelectedOption());
    }

    public String selectDropdownList3() throws Exception {
        Select selectList_comuna = new Select(dropdownList_comuna);
        selectList_comuna.selectByVisibleText("Santiago");
        return getText(selectList_comuna.getFirstSelectedOption());
    }

    public void ClickOnaceptaTerminos() throws Exception {
            this.click(aceptaTerminos);
      }

    public void ClickOnbtnEnviar() throws Exception {
        this.click(botonenviar);
    }
}
