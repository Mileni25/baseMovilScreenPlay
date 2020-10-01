package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.IngresaValor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.choucair.moviles.app.ui.LoginPage.*;

public class IniciaSesion implements Task {

    private String user;
    private String pass;

    public IniciaSesion(String user, String pass){
        this.user = user;
        this.pass = pass;
    }

    public static IniciaSesion iniciaSesion(String user, String pass){
        return Tasks.instrumented(IniciaSesion.class,user,pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(IngresaValor.enElCampo(TXT_USER).elDato(user));
        actor.attemptsTo(IngresaValor.enElCampo(TXT_PASS).elDato(pass));
        actor.attemptsTo(Click.on(BTN_INGRESAR));
    }
}