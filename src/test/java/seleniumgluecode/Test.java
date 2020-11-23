package seleniumgluecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class Test extends TestBase{

    //Scenario 1 (Producto Marketing)

    @Given("^El usuario se encuentra en la página de Gestión Corredor y Hace click sobre el botón Productos Marketing$")
    public void elUsuarioSeEncuentraEnLaPáginaDeGestiónCorredorYHaceClickSobreElBotónProductosMarketing() throws Exception {
        Assert.assertTrue(homePageCorredor.homePageIsDisplayed());
        homePageCorredor.clickOnProductos();
    }

    @And("^Se debe redireccionar a la página productos$")
    public void seDebeRedireccionarALaPáginaProductos() throws Exception {
        Assert.assertTrue("No se redirrecciono correctamente a la pagina de Productos",
        productosPage.isImagenDisplayed());
    }

    @And("^Hace click sobre la tarjeta del producto a contratar$")
    public void haceClickSobreLaTarjetaDelProductoAContratar() throws Exception {
        productosPage.clickOnTarjetaProducto();
    }

    @And("^Visualiza la información del producto seleccionado, se Hacer click al botón Comprar$")
    public void visualizaLaInformaciónDelProductoSeleccionadoSeHacerClickAlBotónComprar() throws Exception {
        Assert.assertTrue(productosPage.isImagenDisplayed2());
        productosPage.ClickOnComprar();
    }

    @And("^Se debe redireccionar a la página de login$")
    public void seDebeRedireccionarALaPáginaDeLogin() throws Exception {
        Assert.assertTrue("No se redirrecciono correctamente a la pagina de Login",
        loginPage.isImagenDisplayed3());
    }

    @And("^Ingresa los credenciales del usuario corredor$")
    public void ingresaLosCredencialesDelUsuarioCorredor() throws Exception {
        Thread.sleep(1000);
        loginPage.typeEmailLocator();
        loginPage.typePasswordLocator();
    }

    @When("^Cuando el usuario ingrese la información requerida válida$")
    public void cuandoElUsuarioIngreseLaInformaciónRequeridaVálidaParaLogiarse() throws Exception {
        loginPage.ClickOnIngresar();
        Assert.assertTrue(datosContratoPage.isImagenDisplayed4());
    }

    @And("^Se llena los formularios con los campos solicitados$")
    public void seLlenaLosFormulariosConLosCamposSolicitados() throws Exception {
        datosContratoPage.typeDatosContratospaso1();
        Assert.assertTrue(datosContratoPage.isImagenDisplayed5());
        datosContratoPage.typeDatosContratospaso2();
        Assert.assertEquals(datosContratoPage.selectDropdownList(), "Metropolitana");
        Assert.assertEquals(datosContratoPage.selectDropdownList1(), "Santiago");
    }

    @And("^Tilda el checkbox Declaro conocer y aceptar los Términos y condiciones de TOCTOC$")
    public void tildaElCheckboxDeclaroConocerYAceptarLosTérminosYCondicionesDeTOCTOC() throws Exception {
        datosContratoPage.ClickOncheckaceptaTerminos();
    }

    @And("^Tilda el checkbox Actualizar la información ingresada$")
    public void tildaElCheckboxActualizarLaInformaciónIngresada() throws Exception {
        datosContratoPage.ClickOncheckactulizainfo();
    }
    @And("^Hace click al botón Enviar$")
    public void darleClickAlBotónEnviar() throws Exception {
        datosContratoPage.ClickOnbtnContinuar();
    }

    @Then("^Se debe redireccionar a la página Detalle del contrato y visualizar medio de pago disponibles$")
    public void seDebeRedireccionarALaPáginaDetalleDelContratoYVisualizarMedioDePagoDisponibles() throws Exception {
        Assert.assertTrue(detalleContratoPage.istitledetalleDisplayed());
        detalleContratoPage.WriteExcelFile();
        detalleContratoPage.ClickOnbtnPagar();
    }

  //Scenario (Planes)

    @Given("^El usuario se encuentra en la página de Gestion Corredor$")
    public void elUsuarioSeEncuentraEnLaPáginaDeGestionCorredor() throws Exception {
        Assert.assertTrue(homePageCorredor.homePageIsDisplayed1());

    }

    @And("^Hace click sobre el botón Ver Planes$")
    public void haceClickSobreElBotónVerPlanes() throws Exception {
        homePageCorredor.clickOnPlanes();
    }

    @And("^Visualiza la información del plan seleccionado y hace click al botón Contratar$")
    public void visualizaLaInformaciónDelPlanSeleccionadoYHaceClickAlBotónContratar() throws Exception {
        Assert.assertTrue(planPage.isImagenDisplayed6());
        planPage.clickOnTarjetaPlan();
    }

    @When("^Registrar Usuario$")
    public void registrarUsuario() throws Exception {
        Assert.assertTrue(registroPagePlan.registroPagePlanIsDisplayed());
        registroPagePlan.typeRegistroPagePlan();
        registroPagePlan.clickOnextstep();
    }

    @And("^Llena los formularios con los campos solicitados$")
    public void llenaLosFormulariosConLosCamposSolicitados() throws Exception {
        Assert.assertTrue(datosContratoPlan.isImagenDisplayed8());
        datosContratoPlan.typeDatosContratosplanpaso1();
        datosContratoPlan.typeDatosContratosplanpaso2();
        datosContratoPlan.selectDropdownList2();
        datosContratoPlan.selectDropdownList3();
    }

    @And("^Tilda el checkbox Declaro conocer y aceptar los Términos y condiciones de TOCTOC del Plan$")
    public void tildaElCheckboxDeclaroConocerYAceptarLosTérminosYCondicionesDeTOCTOCDelPlan() throws Exception {
        datosContratoPlan.ClickOnaceptaTerminos();
    }

    @And("^Darle click al boton Enviar$")
    public void darleClickAlBotonEnviar() throws Exception {
        datosContratoPlan.ClickOnbtnEnviar();
    }

    @Then("^Se debe redireccionar a la página Detalle del contrato del plan a contratar$")
    public void seDebeRedireccionarALaPáginaDetalleDelContratoDelPlanAContratar() throws Exception {
        Assert.assertTrue(detalleContratoPlan.istitledetalleDisplayed9());
        detalleContratoPlan.ClickOnlinkverdetalle();
        detalleContratoPlan.WriteExcelFile1();
        detalleContratoPlan.ClickOnbtnPagar();
        detalleContratoPlan.ClickOnbtnmensaje();
        Assert.assertTrue(detallePagoPage.istitledetallepagoDisplayed4());
        }

}





