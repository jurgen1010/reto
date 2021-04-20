package com.prueba.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.prueba.certificacion.userinterfaces.ConsultarTarifas.BOTON_DESCARGAR_TARIFAS_CUENTAS_DEPOSITOS;

public class DescargarArchivo implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_DESCARGAR_TARIFAS_CUENTAS_DEPOSITOS)
                ,Cambiar.deVentana()
        );
    }

    public static DescargarArchivo tarifasCuentasDepositos(){
        return Tasks.instrumented(DescargarArchivo.class);
    }
}
