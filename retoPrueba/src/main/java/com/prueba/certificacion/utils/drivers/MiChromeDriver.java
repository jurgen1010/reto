package com.prueba.certificacion.utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class MiChromeDriver {

    private static WebDriver driver;

    public static MiChromeDriver web() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver_90.exe");

        String rutaDesrgaArchivoDefecto = "${user.dir}\\src\\test\\resources\\archivos";
        HashMap<String, Object> chromePreferencias = new HashMap<String, Object>();
        chromePreferencias.put("download.default_directory", rutaDesrgaArchivoDefecto);


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs",chromePreferencias);
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-print-preview");
        driver=new ChromeDriver(chromeOptions);
        return new MiChromeDriver();
    }

    public WebDriver enLaPagina(String url) {
        driver.get(url);
        return driver;
    }
}
