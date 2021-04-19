package com.prueba.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.prueba.certificacion.userinterfaces.ConsultarTarifas.CERRAR_BANNER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAl implements Task {

    private final String menu;
    public IngresarAl (String menu){
        this.menu=menu;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Menu desde: "+menu);
        /*
        WaitUntil.the(CERRAR_BANNER, WebElementStateMatchers.isPresent()).forNoMoreThan(5).seconds();
        actor.attemptsTo(Click.on(CERRAR_BANNER));

         */
    }

    public static IngresarAl menu(String menu){
        return instrumented(IngresarAl.class, menu);
    }
}
