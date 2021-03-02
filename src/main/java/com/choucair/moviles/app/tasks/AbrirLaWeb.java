package com.choucair.moviles.app.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLaWeb implements Task {

    public AbrirLaWeb(){}

    public static AbrirLaWeb swagLabs(){
        return Tasks.instrumented(AbrirLaWeb.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://www.saucedemo.com/"));
    }
}