package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistroPagePlan extends BasePage {

    public RegistroPagePlan(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "registroUsuario")
    private WebElement titleregistrousuario;
    private String titlePage9 = "TOCTOC.com Gestión Corredoras";

    @FindBy(id = "nombreUser")
    private By nombreUser;

    @FindBy(id = "telefonoUser")
    private By telefonoUser;

    @FindBy(id = "emailUser")
    private By emailUser;

    @FindBy(id = "password")
    private By password;

    //@FindBy(id = "nextStep")
    @FindBy(xpath = "//*[@id=\"nextStep\"]")
    private WebElement botonextStep1;


    public boolean registroPagePlanIsDisplayed() throws Exception {
        return this.getTitle().equals(titlePage9);
    }

    public void typeRegistroPagePlan() throws Exception {
        Thread.sleep(2000);
        clear(" ", By.id("nombreUser"));
        type("Mariela Hurtado Test", By.id("nombreUser"));
        clear(" ", By.id("telefonoUser"));
        type("+56993947209", By.id("telefonoUser"));
        clear(" ", By.id("emailUser"));
        type("hurtadomariela2@gmail.com", By.id("emailUser"));
        clear(" ", By.id("password"));
        type("prueba", By.id("password"));
    }

      public void clickOnextstep() throws Exception {
        this.click(botonextStep1);
    }
        


}