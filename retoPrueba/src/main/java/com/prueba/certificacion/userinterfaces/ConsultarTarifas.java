package com.prueba.certificacion.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class ConsultarTarifas {

    public static final Target CERRAR_BANNER = Target.the("boton cerrar banner").locatedBy("//*[@id='modal-prehome-fenix']/div/div/div[1]");
    public static final Target SECCION_ENLANCES_ACCESO_RAPIDO = Target.the("opciones accecos rapidos").locatedBy("//*[@id='footer-content']/div[2]/div/div/div[2]/div/h3");
}
