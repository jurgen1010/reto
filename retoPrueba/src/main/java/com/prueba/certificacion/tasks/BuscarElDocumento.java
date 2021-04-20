package com.prueba.certificacion.tasks;

import com.prueba.certificacion.interactions.DescargarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.prueba.certificacion.userinterfaces.ConsultarTarifas.TARIFAS_DE_CUENTAS_DE_DEPOSITOS_LABEL;

public class BuscarElDocumento implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Scroll.to(TARIFAS_DE_CUENTAS_DE_DEPOSITOS_LABEL));
       actor.attemptsTo(DescargarArchivo.tarifasCuentasDepositos());
    }

    public static BuscarElDocumento tarifasDeCuentasDepositos(){
        return Tasks.instrumented(BuscarElDocumento.class);
    }
}
