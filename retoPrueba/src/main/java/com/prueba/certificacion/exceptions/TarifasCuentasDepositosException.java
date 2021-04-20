package com.prueba.certificacion.exceptions;

public class TarifasCuentasDepositosException extends AssertionError{

    public static final String LA_VENTANA_CON_LA_INFORMACION_DETARIFAS_NO_SE_VISUALIZA = "La ventana con el archivo de las tarifas no se visualiza.";

    public TarifasCuentasDepositosException(String message){
        super(message);
    }

    public TarifasCuentasDepositosException(String message, Throwable cause) {
        super(message,cause);
    }
}
