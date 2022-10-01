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
        String URL = ("https://www.google.com/");
        primerSteps.abrirURL(URL);
    }

    @Test
    public void obtenerURL() {
        String expectedURL = "https://www.google.com/";
        Assert.assertEquals(primerSteps.imprimirURLActual(), expectedURL);
        System.out.println("La URL abierta es: " + primerSteps.imprimirURLActual());
    }

    @Test
    public void obtenerTituloPagina() {
        String expectedTitle = "Google";
        Assert.assertEquals(primerSteps.imprimirTituloPagina(), expectedTitle);
        System.out.println("El título de la página es: " + primerSteps.imprimirTituloPagina());
    }

    @AfterTest
    public void despuesDeLaPrueba() {
        System.out.println("Método After (después) de la prueba");
        primerSteps.quitarWebDriver();
    }
}