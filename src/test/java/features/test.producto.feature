@producto

Feature: Catalogo de Productos Marketing
  Como usuario quiero contratar un servicio de un Producto Marketing.

  @browser
  Scenario: Ingresar al catologo de productos Markenting en la página Gestión Corredor y Contratar un servicio
    Given El usuario se encuentra en la página de Gestión Corredor y Hace click sobre el botón Productos Marketing
         And Se debe redireccionar a la página productos
         And Hace click sobre la tarjeta del producto a contratar
         And Visualiza la información del producto seleccionado, se Hacer click al botón Comprar
         And Se debe redireccionar a la página de login
         And Ingresa los credenciales del usuario corredor
      When Cuando el usuario ingrese la información requerida válida
         And Se llena los formularios con los campos solicitados
         And Tilda el checkbox Declaro conocer y aceptar los Términos y condiciones de TOCTOC
         And Tilda el checkbox Actualizar la información ingresada
         And Hace click al botón Enviar
    Then Se debe redireccionar a la página Detalle del contrato y visualizar medio de pago disponibles

