package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UILogin {
    private static final Target TXT_USER = Target.the("Textfield Usuario").located(MobileBy.AccessibilityId("test-Usuario"));
    private static final Target TXT_PASS = Target.the("Textfield Contrase\u00F1a").located(MobileBy.AccessibilityId("test-Contrase\u00F1a"));
    private static final Target BTN_INTRO = Target.the("Button Login").located(MobileBy.AccessibilityId("test-LOGIN"));

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
