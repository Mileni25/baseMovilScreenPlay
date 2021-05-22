package com.choucair.moviles.app.tasks;

import static com.choucair.moviles.app.ui.UILogin.*;
import com.choucair.moviles.app.exceptions.LoginException;
import com.choucair.moviles.app.interactions.choucair.Swipe;
import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.interactions.choucair.Tap;
import com.choucair.moviles.app.models.LoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class HaceLogin implements Task {

    private LoginModel data;

    public HaceLogin(LoginModel data){
        this.data = data;
    }

    public static HaceLogin exitosoConCredenciales(LoginModel credenciales){
        return Tasks.instrumented(HaceLogin.class,credenciales);
    }

    @Override
    @Step("Ingresando credenciales")
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
            		Enter.theValue(data.getUser()).into(txtUser())
                    , Enter.theValue(data.getPass()).into(txtPass())
                    , Swipe.as(actor).fromTop().toBottom()
                    , Swipe.as(actor).fromBottom().toTop()
                    , Swipe.as(actor).fromLeft().toRight()
                    , Swipe.as(actor).fromRight().toLeft()
                    , Tap.on(btnIntro())
                    , TakeScreenshot.asEvidence());
        }catch (RuntimeException ex){
            throw new LoginException(LoginException.ErrorCredenciales(),ex);
        }
    }
}