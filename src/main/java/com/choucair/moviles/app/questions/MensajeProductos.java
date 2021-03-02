package com.choucair.moviles.app.questions;

import static com.choucair.moviles.app.ui.UIHome.lblProducts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class MensajeProductos implements Question<Boolean> {

    private String mensaje;

    public MensajeProductos(String mensaje){
        this.mensaje = mensaje;
    }

    public static MensajeProductos productos(String mensaje){
        return new MensajeProductos(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(lblProducts(),
                WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds());
        return Text.of(lblProducts()).viewedBy(actor).asString().equals(this.mensaje);
    }
}