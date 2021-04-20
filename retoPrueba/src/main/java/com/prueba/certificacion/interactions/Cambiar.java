package com.prueba.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.Set;

public class Cambiar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<String> handles = BrowseTheWeb.as(actor).getDriver().getWindowHandles();

        for (String handle: handles) {
            BrowseTheWeb.as(actor).getDriver().switchTo().window(handle);
        }
    }

    public static Cambiar deVentana(){
        return Tasks.instrumented(Cambiar.class);
    }
}
