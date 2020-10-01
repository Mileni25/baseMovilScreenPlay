package com.choucair.moviles.app.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AbreApp implements Task {

    public static AbreApp eribank(){
        return Tasks.instrumented(AbreApp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    }
}