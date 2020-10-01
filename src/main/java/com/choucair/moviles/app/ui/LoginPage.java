package com.choucair.moviles.app.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target TXT_USER = Target.the("Campo usuario").located(By.id("com.experitest.ExperiBank:id/usernameTextField"));
    public static final Target TXT_PASS = Target.the("Campo contraseña").located(By.id("com.experitest.ExperiBank:id/passwordTextField"));
    public static final Target BTN_INGRESAR = Target.the("Bot\u00F3n ingresar").located(By.id("com.experitest.ExperiBank:id/loginButton"));
}
