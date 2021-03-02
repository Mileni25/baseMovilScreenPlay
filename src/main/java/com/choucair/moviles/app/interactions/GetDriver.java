package com.choucair.moviles.app.interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class GetDriver {

    public static AndroidDriver<MobileElement> androidDriver(Actor actor){
        return (AndroidDriver<MobileElement>) BrowseTheWeb.as(actor).getDriver();
    }

    public static IOSDriver<MobileElement> iosDriver(Actor actor){
        return (IOSDriver<MobileElement>) BrowseTheWeb.as(actor).getDriver();
    }

    public static AppiumDriver<MobileElement> appiumDriver(Actor actor){
        return (AppiumDriver<MobileElement>) BrowseTheWeb.as(actor).getDriver();
    }
}