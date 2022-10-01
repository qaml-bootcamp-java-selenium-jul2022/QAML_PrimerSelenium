import Steps.PrimerSteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class PrimerTest extends BaseTest {
    PrimerSteps primerSteps = new PrimerSteps(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba() {
        System.out.println("Método Before (Antes) Test");
        myWebDriver.get("https://www.google.com");
    }

    @Test
    public void obtenerURL() {
        String expectedURL = "https://www.google.com/";
        primerSteps.abrirGoogle();
        Assert.assertEquals(myWebDriver.getCurrentUrl(), expectedURL);
    }

    @Test
    public void obtenerTituloPagina() {
        String expectedTitle = "Google";
        primerSteps.imprimirTituloPagina();
        Assert.assertEquals(myWebDriver.getTitle(), expectedTitle);
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
    public void despuesDeLaPrueba() {
        System.out.println("Método After (después) de la prueba");
        primerSteps.cerrarNavegador();
    }
}