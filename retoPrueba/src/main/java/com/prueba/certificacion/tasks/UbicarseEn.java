package com.prueba.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.prueba.certificacion.userinterfaces.ConsultarTarifas.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UbicarseEn implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        WaitUntil.the(CERRAR_BANNER, WebElementStateMatchers.isPresent()).forNoMoreThan(5).seconds();
        actor.attemptsTo(Click.on(CERRAR_BANNER));
        actor.attemptsTo(Scroll.to(SECCION_ENLANCES_ACCESO_RAPIDO));
        /*
        Aqui llamo a la interaccion para que vaya a la opcion tarifario, luego una interaccion que me consulte las tarifas para cuentas depositos
         */
    }

    public static UbicarseEn accesosRapidos(){
        return instrumented(UbicarseEn.class);
    }
}
