package com.choucair.moviles.app.stepsdefinitios;

import java.util.List;
import com.choucair.moviles.app.exceptions.errors.LoginErrors;
import com.choucair.moviles.app.models.LoginModel;
import com.choucair.moviles.app.questions.MensajeProductos;
import com.choucair.moviles.app.tasks.HaceLogin;
import com.choucair.moviles.app.tasks.AbreLaApp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginDefinitions {
    @Given("^(.*) abre la app SwagLabs$")
    public void abreLaAppSwagLabs(String nombre) {
        theActorCalled(nombre).wasAbleTo(AbreLaApp.swagLabs());
    }

    @When("^realiza el login con credenciales$")
    public void realizaElLoginConCredenciales(List<LoginModel> credenciales) {
        theActorInTheSpotlight().attemptsTo(HaceLogin.exitosoConCredenciales(credenciales.get(0)));
    }

    @Then("^vera el mensaje (.*)$")
    public void veraElMensajeSuccess(String mensaje) {
        theActorInTheSpotlight().should(
                seeThat(MensajeProductos.text(), equalTo(mensaje))
                        .orComplainWith(LoginErrors.class, LoginErrors.SinVerificarIngreso()));
    }
}