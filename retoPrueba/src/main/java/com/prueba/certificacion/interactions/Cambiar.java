package com.prueba.certificacion.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.Set;

public class Cambiar implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<String> vetanas = BrowseTheWeb.as(actor).getDriver().getWindowHandles();

        String ventanaPadre = BrowseTheWeb.as(actor).getDriver().getWindowHandle();

        for (String ventana: vetanas) {
            String nuevaVentana = "No se Visualiza";
            //BrowseTheWeb.as(actor).getDriver().switchTo().window(handle);
            if(!ventana.equals(ventanaPadre))
            {
                BrowseTheWeb.as(actor).getDriver().switchTo().window(ventana);
                System.out.println("child window");
                nuevaVentana = "Se visualiza";

            }
            Serenity.setSessionVariable("NuevaVentana").to(nuevaVentana);
        }

    }

    public static Cambiar deVentana(){
        return Tasks.instrumented(Cambiar.class);
    }
}
