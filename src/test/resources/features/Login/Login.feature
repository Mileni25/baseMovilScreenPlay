#Author: AdrianP

@Login
Feature: Prubas sobre modulo login
  Como Cliente de SwangLabs
  Quiero ingresar a la tienda online
  Para/Con el objetivo de comprar algún articulo

  @LoginExitoso
  Scenario Outline: Realizar Login Exitoso en SwangLabs
    Given Andrea esta en la tienda SwagLabs
    When realiza el login
      |user|pass|
      |<user>|<pass>|
    Then vera el mensaje <mensaje>

    Examples:
      |user|pass|mensaje|
      |standard_user|secret_sauce|Products|