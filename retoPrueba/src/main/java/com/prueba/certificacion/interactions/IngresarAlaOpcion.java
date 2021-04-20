package com.prueba.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

import static com.prueba.certificacion.userinterfaces.ConsultarTarifas.OPCION_EN_ACCESO_RAPIDO;

public class IngresarAlaOpcion implements Interaction {

    private String opcion;

    public IngresarAlaOpcion(String opcion){
        this.opcion=opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement opcionTarifario =  OPCION_EN_ACCESO_RAPIDO.of(opcion).resolveFor(actor);
        if(!opcionTarifario.isEnabled()){
            WaitUntil.the(OPCION_EN_ACCESO_RAPIDO.of(opcion), WebElementStateMatchers.isNotPresent()).forNoMoreThan(5).seconds();
        }

        actor.attemptsTo(Scroll.to(OPCION_EN_ACCESO_RAPIDO.of(opcion)));

        actor.attemptsTo(Click.on(OPCION_EN_ACCESO_RAPIDO.of(opcion)));
    }

    public static IngresarAlaOpcion deNombre(String opcion){
        return Tasks.instrumented(IngresarAlaOpcion.class, opcion);
    }
}
