package Steps;

import org.openqa.selenium.WebDriver;

public class PrimerSteps extends BaseSteps{

    public PrimerSteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }

    public void abrirGoogle(){
        String paginaAbrir="https://www.google.com/";
        System.out.println("Se abre la siguiente pagina:"+paginaAbrir);
        myWebDriver.get(paginaAbrir);
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

    public void obtenerURL(){
        System.out.println("La URL Abierta es: "+myWebDriver.getCurrentUrl());
    }

    public void obtenerTituloPagina(){
        System.out.println("El titulo de la pagina es: "+myWebDriver.getTitle());
    }

    public void cerrarBrowser(){
        System.out.println("Cerrar el Navegador");
        myWebDriver.quit(); //cierra todas las ventanas abiertas
    }

}
