package com.choucair.moviles.app.tasks;

import static com.choucair.moviles.app.ui.UILogin.*;

import com.choucair.moviles.app.models.LoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class HacerLogin implements Task {

    private LoginModel data;

    public HacerLogin(LoginModel data){
        this.data = data;
    }

    public static HacerLogin exitosoConCredenciales(LoginModel credenciales){
        return Tasks.instrumented(HacerLogin.class,credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.getUser()).into(txtUser())
                ,Enter.theValue(data.getPass()).into(txtPass())
                ,Click.on(btnIntro()));
    }
}