$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.producto.feature");
formatter.feature({
  "line": 3,
  "name": "Catalogo de Productos Marketing",
  "description": "Como usuario quiero contratar un servicio de un Producto Marketing.",
  "id": "catalogo-de-productos-marketing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@producto"
    }
  ]
});
formatter.before({
  "duration": 8701864900,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Ingresar al catologo de productos Markenting en la página Gestión Corredor y Contratar un servicio",
  "description": "",
  "id": "catalogo-de-productos-marketing;ingresar-al-catologo-de-productos-markenting-en-la-página-gestión-corredor-y-contratar-un-servicio",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@browser"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "El usuario se encuentra en la página de Gestión Corredor y Hace click sobre el botón Productos Marketing",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Se debe redireccionar a la página productos",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Hace click sobre la tarjeta del producto a contratar",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Visualiza la información del producto seleccionado, se Hacer click al botón Comprar",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Se debe redireccionar a la página de login",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Ingresa los credenciales del usuario corredor",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Cuando el usuario ingrese la información requerida válida",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Se llena los formularios con los campos solicitados",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Tilda el checkbox Declaro conocer y aceptar los Términos y condiciones de TOCTOC",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Tilda el checkbox Actualizar la información ingresada",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Hace click al botón Enviar",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Se debe redireccionar a la página Detalle del contrato y visualizar medio de pago disponibles",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.elUsuarioSeEncuentraEnLaPáginaDeGestiónCorredorYHaceClickSobreElBotónProductosMarketing()"
});
formatter.result({
  "duration": 590664399,
  "status": "passed"
});
formatter.match({
  "location": "Test.seDebeRedireccionarALaPáginaProductos()"
});
formatter.result({
  "duration": 1029343000,
  "status": "passed"
});
formatter.match({
  "location": "Test.haceClickSobreLaTarjetaDelProductoAContratar()"
});
formatter.result({
  "duration": 2257411100,
  "status": "passed"
});
formatter.match({
  "location": "Test.visualizaLaInformaciónDelProductoSeleccionadoSeHacerClickAlBotónComprar()"
});
formatter.result({
  "duration": 7134687600,
  "status": "passed"
});
formatter.match({
  "location": "Test.seDebeRedireccionarALaPáginaDeLogin()"
});
formatter.result({
  "duration": 5031218300,
  "status": "passed"
});
formatter.match({
  "location": "Test.ingresaLosCredencialesDelUsuarioCorredor()"
});
formatter.result({
  "duration": 3146203200,
  "status": "passed"
});
formatter.match({
  "location": "Test.cuandoElUsuarioIngreseLaInformaciónRequeridaVálidaParaLogiarse()"
});
formatter.result({
  "duration": 2491425700,
  "status": "passed"
});
formatter.match({
  "location": "Test.seLlenaLosFormulariosConLosCamposSolicitados()"
});
formatter.result({
  "duration": 2705850600,
  "status": "passed"
});
formatter.match({
  "location": "Test.tildaElCheckboxDeclaroConocerYAceptarLosTérminosYCondicionesDeTOCTOC()"
});
formatter.result({
  "duration": 2665603699,
  "status": "passed"
});
formatter.match({
  "location": "Test.tildaElCheckboxActualizarLaInformaciónIngresada()"
});
formatter.result({
  "duration": 2660399100,
  "status": "passed"
});
formatter.match({
  "location": "Test.darleClickAlBotónEnviar()"
});
formatter.result({
  "duration": 231223000,
  "status": "passed"
});
formatter.match({
  "location": "Test.seDebeRedireccionarALaPáginaDetalleDelContratoYVisualizarMedioDePagoDisponibles()"
});
formatter.result({
  "duration": 7374065100,
  "status": "passed"
});
formatter.after({
  "duration": 948891101,
  "status": "passed"
});
});