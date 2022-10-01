package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimerSteps extends BaseSteps{


    public PrimerSteps(WebDriver webDriverDeTests) {
        super(webDriverDeTests);
    }


    //PASO 1
    public void abrirGoogle(){
        myWebDriver.get("https://www.google.com/");
    }
    //PASO 2
    public void imprimirTituloPagina(){
        System.out.println(myWebDriver.getTitle());
    }
    //PASO 3
    public void imprimirURLActual(){
        System.out.println(myWebDriver.getCurrentUrl());
    }
    //PASO 4
    public void imprimirCodigoFuente(){
        System.out.println(myWebDriver.getPageSource());
    }
    //PASO 5
    public void cerrarNavegador(){
        myWebDriver.close();
    }
    }
