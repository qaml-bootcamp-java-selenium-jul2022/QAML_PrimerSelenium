import Steps.PrimerStep;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrimerTest extends BaseTest {
    PrimerStep primerStep;

    @BeforeTest
    public void antesDeLaPrueba() {
        primerStep = new PrimerStep(myWebDriver);
        primerStep.visitarPagina();
    }

    @Test
    public void obtenerURL() {
        primerStep.obtenerURL();
    }

    @Test
    public void obtenerTituloPagina() {
        primerStep.obtenerTituloPagina();
    }

    @AfterTest
    public void despuesDeLaPrueba() {
        primerStep.despuesDeLaPrueba();
    }
}
