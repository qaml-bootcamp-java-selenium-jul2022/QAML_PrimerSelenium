package Steps;

import org.openqa.selenium.WebDriver;

public class PrimerSteps extends BaseSteps{

    public PrimerSteps(WebDriver webDriverDeTest) {
        super(webDriverDeTest);
    }

    public void abrirURLPagina(){
        myWebDriver.get("https:www.google.com");
    }

    public void obtenerURLPagina(){
        System.out.println("la url abierta es "+myWebDriver.getCurrentUrl());
    }

    public void obtenerTituloPaginaAbierta(){
        System.out.println("El título de la página es "+ myWebDriver.getTitle());
    }
    public void cerrarPagina(){
        myWebDriver.quit();
    }


}
