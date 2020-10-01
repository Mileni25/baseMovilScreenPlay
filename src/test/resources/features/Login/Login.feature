#author: Adrian Pulido
#language: es

  @Login
  Característica: Ingreso a la app Eribank
  Como usuario quiero autenticarme en la app para verificar mis credenciales

  @LoginExitoso
  Escenario: Login Exitoso
    Dado que Adrian ingresa a la app Eribank
    Cuando inicia sesion con el usuario "company" y la clave "company"
    Entonces podria ver el mensaje "Your balance is:"