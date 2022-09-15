package Steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PrimerStep extends BaseSteps{
    public PrimerStep(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }


    public void obtenerURL() {
        String expectedURL = "https://www.google.com/";
        System.out.println("La URL abierta es: " + myWebDriver.getCurrentUrl());
        Assert.assertEquals(myWebDriver.getCurrentUrl(), expectedURL);
    }

    public void obtenerTituloPagina() {
        String expectedTitle = "Google";
        System.out.println("El título de la página es: " + myWebDriver.getTitle());
        Assert.assertEquals(myWebDriver.getTitle(), expectedTitle);
    }

    public void despuesDeLaPrueba() {
        System.out.println("Método After (después) de la prueba");
        myWebDriver.quit();
    }

    public void abrirGoogle(){
        myWebDriver.get("https://www.google.com/");
    }

    public void imprimirTituloPagina(){
        System.out.println(myWebDriver.getTitle());
    }
    public void imprimirUrlActual(){
        System.out.println(myWebDriver.getCurrentUrl());
    }
    public void imprimirCodigoFuente(){
        System.out.println(myWebDriver.getPageSource());
    }



    public void navegarAUrl(String web){
        myWebDriver.navigate().to(web);
    }

    public void moverAtras(){
        myWebDriver.navigate().back();
    }

    public void moverAdelante(){
        myWebDriver.navigate().forward();
    }

    public void refrescarUrl(){
        myWebDriver.navigate().refresh();
    }

}
