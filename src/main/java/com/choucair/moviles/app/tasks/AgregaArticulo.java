package com.choucair.moviles.app.tasks;

import static com.choucair.moviles.app.ui.UIArticulo.*;
import static com.choucair.moviles.app.ui.UIHome.btnAlternar;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class AgregaArticulo implements Task {

    List<String> nombreArticulos;

    public AgregaArticulo(List<String> nombreArticulos){
        this.nombreArticulos = nombreArticulos;
    }

    public static AgregaArticulo alCarrito(List<String> articulos){
        return Tasks.instrumented(AgregaArticulo.class,articulos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(btnAlternar())
                ,WaitUntil.the(getCrdArticulo(),
                        WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds());
        List<WebElementFacade> articulos = getCrdArticulo().resolveAllFor(actor);
        String tituloArticulo;

        for(String nombreArticulo : nombreArticulos) {
            for(WebElementFacade articulo : articulos){
                tituloArticulo = articulo.findBy(lblTituloProducto().getCssOrXPathSelector()).getText();
                if (nombreArticulo.equals(tituloArticulo))
                    actor.attemptsTo(Click.on((WebElementFacade) articulo.findBy(
                            btnAnadirCarrito().getCssOrXPathSelector())));
            }
        }
    }
}
