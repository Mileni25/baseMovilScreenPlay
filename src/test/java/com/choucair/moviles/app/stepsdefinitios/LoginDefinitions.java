package com.choucair.moviles.app.stepsdefinitios;

import com.choucair.moviles.app.models.LoginModel;
import com.choucair.moviles.app.questions.MensajeProductos;
import com.choucair.moviles.app.tasks.HacerLogin;
import com.choucair.moviles.app.tasks.AbrirLaWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class LoginDefinitions {
    @Given("^(.*) esta en la tienda SwagLabs$")
    public void estaEnLaTiendaSwagLabs(String nombre) {
        OnStage.theActorCalled(nombre).wasAbleTo(AbrirLaWeb.swagLabs());
    }

    @When("^realiza el login$")
    public void realizaElLogin(List<LoginModel> credenciales) {
        OnStage.theActorInTheSpotlight().attemptsTo(HacerLogin.exitosoConCredenciales(credenciales.get(0)));
    }

    @Then("^vera el mensaje (.*)$")
    public void veraElMensajeSuccess(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MensajeProductos.productos(mensaje)));
    }
}