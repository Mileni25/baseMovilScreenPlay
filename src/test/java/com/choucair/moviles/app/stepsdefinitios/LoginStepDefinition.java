package com.choucair.moviles.app.stepsdefinitios;

import com.choucair.moviles.app.questions.ElMensaje;
import com.choucair.moviles.app.tasks.AbreApp;
import com.choucair.moviles.app.tasks.IniciaSesion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actors.OnStage;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsString;

public class LoginStepDefinition {
    @Dado("^que (.*) ingresa a la app Eribank$")
    public void queElUsuarioIngresaALaAppEribank(String adrian) {
        OnStage.theActorCalled(adrian).wasAbleTo(AbreApp.eribank());
    }

    @Cuando("^inicia sesion con el usuario \"([^\"]*)\" y la clave \"([^\"]*)\"$")
    public void iniciaSesionConElUsuarioYLaClave(String user, String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(IniciaSesion.iniciaSesion(user,pass));
    }

    @Entonces("^podria ver el mensaje \"([^\"]*)\"$")
    public void podriaVerElMensaje(String mensaje) {
        OnStage.theActorInTheSpotlight().should(seeThat(ElMensaje.deYourBalanceIs(),containsString(mensaje)));
    }
}