package Steps;

import org.openqa.selenium.WebDriver;

public class PrimerSteps extends BaseSteps{
    public PrimerSteps(WebDriver webDriver) {
        super(webDriver);
    }

    String facebookURL = "https://www.facebook.com/";
    String espnURL = "https://www.espn.com.mx/";
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

    public void refrescarNavegador(){
        myWebDriver.navigate().refresh();
        System.out.println(myWebDriver.getCurrentUrl());
    }

    public void navegarAFacebook(){
        myWebDriver.navigate().to(facebookURL);
        System.out.println(myWebDriver.getCurrentUrl());
    }
    public void navegarAESPN(){
        myWebDriver.navigate().to(espnURL);
        System.out.println(myWebDriver.getCurrentUrl());
    }

    public void retrocederEnNavegador(){
        myWebDriver.navigate().back();
        System.out.println(myWebDriver.getCurrentUrl());
    }
    public void avanzarEnNavegador(){
        myWebDriver.navigate().forward();
        System.out.println(myWebDriver.getCurrentUrl());
    }

}
