package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlanPage extends BasePage {

    public PlanPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@id=\"planes\"]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/h4")
    //@FindBy (className = "desktop")
    private WebElement tituloplanes;
    private String titlePage30 = "TOCTOC.com - Gestión corredor - Planes de publicación";

    @FindBy (name ="inicia")
    private WebElement planseleccionado;

    public boolean isImagenDisplayed6() throws Exception {
        Thread.sleep(2000);
        return this.isDisplayed(tituloplanes) && this.getTitle().equals(titlePage30);
    }

    public void clickOnTarjetaPlan() throws Exception {
        //Thread.sleep(2000);
        this.click(planseleccionado);
    }



}
