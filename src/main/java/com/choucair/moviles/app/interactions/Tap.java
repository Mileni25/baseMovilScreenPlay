package com.choucair.moviles.app.interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.TheLocation;
import net.serenitybdd.screenplay.questions.TheSize;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class Tap implements Interaction {

    private int posX;
    private int posY;

    public Tap(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    /*public static Tap enElObjeto(Target elemento){
        return Tasks.instrumented(Tap.class,posX,posY);
    }*/
    public static Tap enLaCoordenada(int posX, int posY){
        return Tasks.instrumented(Tap.class,posX,posY);
    }

    @Override
    @Step("{0} hace tap en la coordenada (#posX,#posY)")
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver driver = (AppiumDriver)BrowseTheWeb.as(actor).getDriver();
        new TouchAction((PerformsTouchActions)driver).tap(
                new TapOptions().withPosition(
                        new PointOption<>().withCoordinates(posX,posY))) .perform().release();
    }
}
