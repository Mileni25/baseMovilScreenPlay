package com.choucair.moviles.app.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UILogin {
    private static final Target TXT_USER = Target.the("Textfeld Usuario").located(By.id("user-name"));
    private static final Target TXT_PASS = Target.the("Textfeld Usuario").located(By.id("password"));
    private static final Target BTN_INTRO = Target.the("Textfeld Usuario").located(By.id("login-button"));

    private UILogin() {
        throw new IllegalStateException("Error en UILogin");
    }

    public static Target txtUser(){
        return TXT_USER;
    }

    public static Target txtPass() {
        return TXT_PASS;
    }

    public static Target btnIntro() {
        return BTN_INTRO;
    }
}
