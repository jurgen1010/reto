package com.prueba.certificacion.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TarifasCuentaDepositos implements Question<Boolean> {

    public static TarifasCuentaDepositos enPantalla(){
        return new TarifasCuentaDepositos();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean esExitoso= false;
        String  resultadoEsperado = "Se visualiza";
        esExitoso = TarifasCuentaDepositos(resultadoEsperado);
        return esExitoso;
    }

    private Boolean TarifasCuentaDepositos (String esperado){
        String resultadoEncontrado = Serenity.sessionVariableCalled("NuevaVentana");
        boolean result;
        if (esperado.equalsIgnoreCase(resultadoEncontrado)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
