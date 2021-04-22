package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UIArticulo {
    private static final Target CRD_ARTICULO = Target.the("Mensaje Products")
            .locatedBy("//*[@content-desc=\"test-Articulo\"]");
    private static final Target LBL_TITULO_PRODUCTO = Target.the("Mensaje Products")
            .locatedBy("//*[@content-desc=\"test-Titulo de articulo\"]");
    private static final Target BTN_ANADIR_CARRITO = Target.the("Mensaje Products")
            .locatedBy("//*[@content-desc=\"test-A\u00d1ADIR A CARRITO\"]");

    private UIArticulo() {
        throw new IllegalStateException("Error en UIHome");
    }

    public static Target getCrdArticulo() {
        MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"%s\").instance(0))");
        return CRD_ARTICULO;
    }

    public static Target lblTituloProducto() {
        return LBL_TITULO_PRODUCTO;
    }

    public static Target btnAnadirCarrito() {
        return BTN_ANADIR_CARRITO;
    }
}
