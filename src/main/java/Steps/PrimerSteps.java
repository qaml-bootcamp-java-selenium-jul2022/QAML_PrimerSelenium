package Steps;

import org.openqa.selenium.WebDriver;

public class PrimerSteps extends BaseSteps {

    String facebookURL ="https://www.facebook.com";
    String espnURL ="https://www.ESPN.com";
    public PrimerSteps(WebDriver webDriver) {
        super(webDriver);
    }
    public void abrirGoogle() {
        myWebDriver.get("Https://www.google.com");

    }
    public void imprimirTitulo(){
        System.out.println("Imprime el titulo de la pagina" + myWebDriver.getTitle());

    }
    public void imprimirURLActual(){
        System.out.println("Imprime URL actual" + myWebDriver.getTitle());
    }
    public void imprimirCodigoFuente(){
        System.out.println("Imprime el source de la Pagina" + myWebDriver.getPageSource());

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