package com.choucair.moviles.app.exceptions;

public class LoginException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String ERROR_CREDENCIALES = "Error ingresando las credenciales de acceso";

    public LoginException (String mensaje, Throwable razon){
        super(mensaje,razon);
    }

    public static String ErrorCredenciales() {
        return ERROR_CREDENCIALES;
    }
}
