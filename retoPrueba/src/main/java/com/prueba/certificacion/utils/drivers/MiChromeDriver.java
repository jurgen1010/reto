package com.prueba.certificacion.utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MiChromeDriver {

    private static WebDriver driver;

    public static MiChromeDriver web() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver_89.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver=new ChromeDriver(chromeOptions);
        return new MiChromeDriver();
    }

    public WebDriver enLaPagina(String url) {
        driver.get(url);
        return driver;
    }
}
