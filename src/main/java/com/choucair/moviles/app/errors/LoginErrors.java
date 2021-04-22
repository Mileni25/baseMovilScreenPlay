package com.choucair.moviles.app.errors;

public class LoginErrors extends AssertionError{
    private static final String SIN_VERIFICAR_INGRESO = "No fue posible verificar el ingreso exitoso a la app";

    public LoginErrors(String mensaje, Throwable razon){
        super(mensaje,razon);
    }

    public static String SinVerificarIngreso() {
        return SIN_VERIFICAR_INGRESO;
    }
}
