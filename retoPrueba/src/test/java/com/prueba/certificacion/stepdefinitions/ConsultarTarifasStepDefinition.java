package com.prueba.certificacion.stepdefinitions;

import com.prueba.certificacion.exceptions.TarifasCuentasDepositosException;
import com.prueba.certificacion.questions.TarifasCuentaDepositos;
import com.prueba.certificacion.tasks.BuscarElDocumento;
import com.prueba.certificacion.tasks.UbicarseEn;
import com.prueba.certificacion.utils.drivers.MiChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static com.prueba.certificacion.exceptions.TarifasCuentasDepositosException.LA_VENTANA_CON_LA_INFORMACION_DETARIFAS_NO_SE_VISUALIZA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
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
        theActorInTheSpotlight().attemptsTo(UbicarseEn.accesosRapidos());
    }


    @Cuando("^Consulto el archivo de tarifas de Cuentas de Depositos$")
    public void consultoElArchivoDeTarifasDeCuentasDeDepositos()  {
        theActorInTheSpotlight().attemptsTo(BuscarElDocumento.tarifasDeCuentasDepositos());
    }

    @Entonces("^Visualizo en una nueva ventana el archivo de tarifas$")
    public void visualizoEnUnaNuevaVentanaElArchivoDeTarifas()  {
        theActorInTheSpotlight().should(seeThat(TarifasCuentaDepositos.enPantalla()).orComplainWith(TarifasCuentasDepositosException.class,LA_VENTANA_CON_LA_INFORMACION_DETARIFAS_NO_SE_VISUALIZA));
    }
}
