@login

Feature: Iniciar Sesión HomePage
  Como usuario quiero iniciar sesión con credenciales válida

  @browser
  Scenario: Ingresar a la página principal de Toctoc e Iniciar sesión
    Given El usuario se encuentra en la página de Toctoc y Hace click sobre el mensaje desplegado
    And Se Hacer click al botón Entrar
    And Ingresa los credenciales del usuario
    When Cuando el usuario ingrese la credenciales válida
    Then Se debe redireccionar a la página principal y el sistema da la bienvenida al usuario

