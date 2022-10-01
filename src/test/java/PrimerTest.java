import Steps.PrimerSteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrimerTest extends BaseTest{
    PrimerSteps primerSteps = new PrimerSteps(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba(){
        System.out.println("Metodo Before (antes) test");
        primerSteps.abrirGoogle();
    }

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

    @Test
    public void obtenerURLActual(){
        primerSteps.imprimirURLActual();
    }

    @Test
    public void obtenerCodigoFuente(){
        primerSteps.imprimirCodigoFuente();
    }

    @AfterTest
    public void despuesDeLaPrueba(){
        System.out.println("Metodo After (despues) de la prueba");
        myWebDriver.quit();//cierra toda la sesion de memoria; CLOSE solo la pestaña actual
    }
}
