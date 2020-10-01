package com.choucair.moviles.app.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Evaluate;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.choucair.moviles.app.ui.HomePage.LBL_MENSAJE;
import static  net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ElMensaje implements Question<String> {

    public static ElMensaje deYourBalanceIs(){
        return new ElMensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(LBL_MENSAJE,isPresent()).forNoMoreThan(15).seconds());
        return Text.of(LBL_MENSAJE).viewedBy (actor).asString();
    }
}