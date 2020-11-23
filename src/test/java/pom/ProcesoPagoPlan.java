package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProcesoPagoPlan extends BasePage {

    public ProcesoPagoPlan(WebDriver driver) {
        super(driver);
    }

    @FindBy(using = "2.38 UF")
    private By esperadoResultado;
    private String titlePage42 = "TOCTOC.com Gestión Corredoras";


    @FindBy(css = "precio")
    private boolean actualResultado;
    private String titlePage48 = "TOCTOC.com Gestión Corredoras";

    /*public void getActualResultado() throws Exception {
        ifww (actualResultado = this.getText(actualResultado).equals(esperadoResultado)) {
            System.out.println("Prueba paso: El resultado actual es " + actualResultado + "es igual a" + esperadoResultado);
        } else {
            System.out.println("Prueba fallo: El resultado actual es " + actualResultado + "es igual a" + esperadoResultado);
        }
    }


    public String getText(By actualResultado) throws Exception {
        {
           return actualResultado= driver.findElement(actualResultado).getText();
            if (actualResultado = this.getText(actualResultado).equals(esperadoResultado){
                System.out.println("Prueba paso: El resultado actual es " + actualResultado + "es igual a" + esperadoResultado);
            } else {
                System.out.println("Prueba fallo: El resultado actual es " + actualResultado + "es igual a" + esperadoResultado);
            }
        }
 */
    }


