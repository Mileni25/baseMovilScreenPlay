package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target LBL_MENSAJE = Target.the("Your balance is: ").located(By.className("android.view.View"));
    public static final Target BTN_MAKE_PAYMENT = Target.the("Bot\u00F3n Make Payment").located(By.id(""));
    public static final Target BTN_MORTAGE_REQUEST = Target.the("Bot\u00F3n Mortage Request").located(By.id(""));
    public static final Target BTN_EXPENSE_REPORT = Target.the("Bot\u00F3n Expense Report").located(By.id(""));
    public static final Target BTN_LOGOUT = Target.the("Bot\u00F3n Logout").located(MobileBy.iOSNsPredicateString(""));
}
