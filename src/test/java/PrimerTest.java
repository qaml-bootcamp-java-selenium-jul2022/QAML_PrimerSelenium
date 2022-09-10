import Steps.PrimerSteps;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrimerTest extends BaseTest {
    PrimerSteps primerSteps = new PrimerSteps(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba() {
        System.out.println("Método Before (Antes) Test");
        primerSteps.abrirURLGoogle();
    }

    @Test
    public void obtenerURL() {
        String expectedURL = "https://www.google.com/";
        primerSteps.obtenerURLPagina();
        System.out.println("La URL abierta es: " + myWebDriver.getCurrentUrl());
        Assert.assertEquals(myWebDriver.getCurrentUrl(), expectedURL);
    }

    @Test
    public void obtenerTituloPagina() {
        String expectedTitle = "Google";
        primerSteps.obtenerTituloPaginaAbierta();
        System.out.println("El título de la página es: " + myWebDriver.getTitle());
        Assert.assertEquals(myWebDriver.getTitle(), expectedTitle);
    }

    @AfterTest
    public void despuesDeLaPrueba() {
        System.out.println("Método After (después) de la prueba");
        primerSteps.cerrarNavegador();
    }
}