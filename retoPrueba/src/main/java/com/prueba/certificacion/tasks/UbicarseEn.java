package com.prueba.certificacion.tasks;

import com.prueba.certificacion.interactions.IngresarAlaOpcion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.prueba.certificacion.userinterfaces.ConsultarTarifas.CERRAR_BANNER;
import static com.prueba.certificacion.userinterfaces.ConsultarTarifas.SECCION_ENLANCES_ACCESO_RAPIDO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UbicarseEn implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.the(CERRAR_BANNER, WebElementStateMatchers.isNotPresent()).forNoMoreThan(6).seconds();
        actor.attemptsTo(Click.on(CERRAR_BANNER));
        actor.attemptsTo(Scroll.to(SECCION_ENLANCES_ACCESO_RAPIDO));
        actor.attemptsTo(IngresarAlaOpcion.deNombre("Tarifario"));
    }

    public static UbicarseEn accesosRapidos(){
        return instrumented(UbicarseEn.class);
    }
}
