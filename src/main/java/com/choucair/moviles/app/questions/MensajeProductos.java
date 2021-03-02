package com.choucair.moviles.app.questions;

import static com.choucair.moviles.app.ui.UIHome.lblProducts;
import com.choucair.moviles.app.interactions.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class MensajeProductos implements Question<String> {

    public MensajeProductos(){
    }

    public static MensajeProductos text(){
        return new MensajeProductos();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(lblProducts(),
                WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds()
                , TakeScreenshot.asEvidence());
        return Text.of(lblProducts()).viewedBy(actor).asString();
    }
}