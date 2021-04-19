package com.prueba.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class ingresarAlaOpcion implements Interaction {

    private String opcion;

    public ingresarAlaOpcion(String opcion){
        this.opcion=opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Dentro de interacion para ingresar a :"+opcion);
    }

    public static ingresarAlaOpcion deNombre(String opcion){
        return Tasks.instrumented(ingresarAlaOpcion.class, opcion);
    }
}
