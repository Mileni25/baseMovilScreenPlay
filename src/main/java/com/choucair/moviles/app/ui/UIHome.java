package com.choucair.moviles.app.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UIHome {
    private static final Target LBL_PRODUCTS = Target.the("Mensaje Products").located(By.className("product_label"));

    private UIHome() {
        throw new IllegalStateException("Error en UIHome");
    }

    public static Target lblProducts() {
        return LBL_PRODUCTS;
    }
}
