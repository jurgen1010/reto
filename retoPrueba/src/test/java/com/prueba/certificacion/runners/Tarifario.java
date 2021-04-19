package com.prueba.certificacion.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/tarifario.feature",
        glue = "com.prueba.certificacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class Tarifario {

}
