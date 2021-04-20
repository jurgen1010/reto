package com.prueba.certificacion.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class ConsultarTarifas {

    public static final Target CERRAR_BANNER = Target.the("boton cerrar banner").locatedBy("//*[@id='modal-prehome-fenix']/div/div/div[1]");
    public static final Target SECCION_ENLANCES_ACCESO_RAPIDO = Target.the("opciones accesos rapidos").locatedBy("//*[@id='footer-content']/div[2]/div/div/div[2]/div/h3");
    public static final Target LOGO_BANISTMO = Target.the("logo inferior de banistmo").locatedBy("//a[@class='logo-banistmo']");
    public static final Target OPCION_EN_ACCESO_RAPIDO = Target.the("opcion en menu de accesos rapidos").locatedBy("//a[text ( )='{0}']");
    public static final Target TARIFAS_DE_CUENTAS_DE_DEPOSITOS_LABEL = Target.the("label Tarifas de Cuentas de Depositos").locatedBy("//*[@id='layoutContainers']/div/div[1]/section/div[2]/div[2]/div/div/table/tbody/tr[3]/td[1]/span");
    public static final Target BOTON_DESCARGAR_TARIFAS_CUENTAS_DEPOSITOS = Target.the("buton descargar tarifas ").locatedBy("//*[@id='layoutContainers']/div/div[1]/section/div[2]/div[2]/div/div/table/tbody/tr[3]/td[2]/span");

}
