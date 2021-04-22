#Author: AdrianP
@Login
Feature: Pruebas sobre modulo login
  Como Cliente de SwangLabs
  Quiero ingresar a la tienda app
  Para comprar algún articulo

  @LoginExitoso
  Scenario Outline: Realizar Login Exitoso en SwangLabs
    Given Monica abre la app SwagLabs
    When realiza el login con credenciales
      |user|pass|
      |<user>|<pass>|
    Then vera el mensaje <mensaje>

    Examples:
      |user|pass|mensaje|
      |standard_user|secret_sauce|PRODUCTOS|