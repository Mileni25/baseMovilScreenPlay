package com.choucair.moviles.app.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIHome {
    private static final Target LBL_PRODUCTS = Target.the("Mensaje Products").located(By.xpath("//android.view.ViewGroup[@content-desc='test-Zona de ca\u00edda del carrito de compras']/android.view.ViewGroup/android.widget.TextView"));

    private UIHome() {
        throw new IllegalStateException("Error en UIHome");
    }

    public static Target lblProducts() {
        return LBL_PRODUCTS;
    }
}
