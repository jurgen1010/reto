package com.prueba.certificacion.stepdefinitions;

import com.prueba.certificacion.tasks.IngresarAl;
import com.prueba.certificacion.utils.drivers.MiChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.prueba.certificacion.userinterfaces.ConsultarTarifas.CERRAR_BANNER;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarTarifasStepDefinition {

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Yo como usuario del portal web de banistmo$")
    public void yoComoUsuarioDelPortalWebDeBanistmo()  {
        OnStage.theActorCalled("Jurgen");
        theActorInTheSpotlight().can(BrowseTheWeb.with(MiChromeDriver.web().enLaPagina("https://www.banistmo.com/wps/portal/banistmo/personas/")));
    }

    @Cuando("^Ingreso al menu tarifario$")
    public void ingresoAlMenuTarifario()  {
        theActorInTheSpotlight().attemptsTo(IngresarAl.menu("Tarifario"));
    }


    @Cuando("^Consulto el archivo de tarifas de Cuentas de Depositos$")
    public void consultoElArchivoDeTarifasDeCuentasDeDepositos()  {

    }

    @Entonces("^Visualizo que la tarifa a mi cuenta es la correcta$")
    public void visualizoQueLaTarifaAMiCuentaEsLaCorrecta(List<String> datos)  {
        System.out.println(datos.get(0));
    }
}
