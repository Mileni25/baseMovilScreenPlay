package com.choucair.moviles.app.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class IngresaValor implements Interaction {

    private Target objeto;
    private String dato;

    public IngresaValor(Target objeto, String dato){
        this.objeto = objeto;
        this.dato = dato;
    }

    public IngresaValor(Target objeto){
        this.objeto = objeto;
    }

    public static IngresaValor enElCampo(Target objeto){
        return new IngresaValor(objeto);
    }

    public IngresaValor elDato(String dato){
        return Tasks.instrumented(IngresaValor.class,objeto,dato);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(objeto,isPresent()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Enter.theValue(dato).into(objeto));
        Serenity.takeScreenshot();
    }
}