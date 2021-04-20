package com.prueba.certificacion.tasks;

import com.prueba.certificacion.interactions.IngresarAlaOpcion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static com.prueba.certificacion.userinterfaces.ConsultarTarifas.CERRAR_BANNER;
import static com.prueba.certificacion.userinterfaces.ConsultarTarifas.SECCION_ENLANCES_ACCESO_RAPIDO;
import static java.util.concurrent.TimeUnit.SECONDS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UbicarseEn implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().manage().timeouts().implicitlyWait(8, SECONDS);
        WebElement btnCerrarBanner = CERRAR_BANNER.resolveFor(actor);
        if (btnCerrarBanner.isDisplayed()){
            actor.attemptsTo(Click.on(CERRAR_BANNER));
        }
        actor.attemptsTo(Scroll.to(SECCION_ENLANCES_ACCESO_RAPIDO));
        actor.attemptsTo(IngresarAlaOpcion.deNombre("Tarifario"));
    }

    public static UbicarseEn accesosRapidos(){
        return instrumented(UbicarseEn.class);
    }
}
