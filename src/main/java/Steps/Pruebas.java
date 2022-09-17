package Steps;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Pruebas extends BaseTest{
    @Test
    public void obtenerUrl(){
        String expectedURL = "https://www.google.com/";
        System.out.println("La url abierta es: "+myWebDriver.getCurrentUrl());
        Assert.assertEquals(myWebDriver.getCurrentUrl(),expectedURL);
    }

    @Test
    public void obtenerTituloPagina(){
        String expectedTitle = "Google";
        System.out.println("El titulo de la pagina es: "+ myWebDriver.getTitle());
        Assert.assertEquals(myWebDriver.getTitle(),expectedTitle);
    }
}
