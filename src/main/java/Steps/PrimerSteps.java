package Steps;

import org.openqa.selenium.WebDriver;

public class PrimerSteps extends BaseSteps{
    public PrimerSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void abrirURLEnBrowser(){
        myWebDriver.get("https://www.google.com/");
    }
    public void obtenerTituloPagina(){
        System.out.println("El título de la página es "+ myWebDriver.getTitle());
    }
    public void obtenerURLActual(){
        System.out.println("La url de la pagina es "+myWebDriver.getCurrentUrl());
    }

    public void imprimirCodigoFuente(){
        System.out.println(myWebDriver.getPageSource());
    }

    public void cerrarNavegador(){
        myWebDriver.close();
    }

}
