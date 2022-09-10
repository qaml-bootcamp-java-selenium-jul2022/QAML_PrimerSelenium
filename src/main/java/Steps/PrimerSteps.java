package Steps;

import org.openqa.selenium.WebDriver;

public class PrimerSteps extends BaseSteps{
    public PrimerSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void abrirGoogle() {
        myWebDriver.get("https://www.google.com/");
    }

    public void imprimirTituloPagina() {
        System.out.println(myWebDriver.getTitle());
    }

    public void imprimirURLActual() {
        System.out.println(myWebDriver.getCurrentUrl());
    }

    public void imprimirCodigoFuente() {
        System.out.println(myWebDriver.getPageSource());
    }

    public void cerrarNavegador() {
        myWebDriver.close();
    }

    public void abrirURL(String url) {
        myWebDriver.get(url);
    }
}
