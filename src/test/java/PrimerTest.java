import Steps.PrimerStep;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrimerTest extends BaseTest {

    PrimerStep primerStep =new PrimerStep(myWebDriver);

    @BeforeTest
    public void antesDeLaPrueba() {
        System.out.println("Método Before (Antes) Test");
        String URL = ("https://www.google.com/");
        primerStep.abrirURL(URL);
    }

    @Test
    public void obtenerURL() {
        String expectedURL = "https://www.google.com/";
        Assert.assertEquals(primerStep.obtenerURL(), expectedURL);
        System.out.println("La URL abierta es: " + primerStep.obtenerURL());
    }

    @Test
    public void obtenerTituloPagina() {
        String expectedTitle = "Google";
        Assert.assertEquals(primerStep.obtenerTituloPagina(), expectedTitle);
        System.out.println("El título de la página es: " + primerStep.obtenerTituloPagina());
    }

    @AfterTest
    public void despuesDeLaPrueba() {
        System.out.println("Método After (después) de la prueba");
        primerStep.cerrarURL();
    }
}