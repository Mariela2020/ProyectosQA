package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.*;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected HomePageCorredor  homePageCorredor = PageFactory.initElements(driver, HomePageCorredor.class);
    protected ProductosPage productosPage = PageFactory.initElements(driver, ProductosPage.class);
    protected LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    protected DatosContratoPage datosContratoPage = PageFactory.initElements(driver, DatosContratoPage.class);
    protected DetalleContratoPage detalleContratoPage = PageFactory.initElements(driver, DetalleContratoPage.class);
    protected PlanPage planPage = PageFactory.initElements(driver, PlanPage.class);
    protected DatosContratoPlan datosContratoPlan = PageFactory.initElements(driver, DatosContratoPlan.class);
    protected DetalleContratoPlan detalleContratoPlan = PageFactory.initElements(driver, DetalleContratoPlan.class);
    protected DetallePagoPage detallePagoPage = PageFactory.initElements(driver, DetallePagoPage.class);
    protected RegistroPagePlan registroPagePlan = PageFactory.initElements(driver, RegistroPagePlan.class);
}
