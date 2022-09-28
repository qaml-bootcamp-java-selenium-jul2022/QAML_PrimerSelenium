import Steps.PrimerSteps;
import org.testng.annotations.Test;

public class EjerciciosEnClaseTests extends BaseTest {

    PrimerSteps primerSteps = new PrimerSteps(myWebDriver);

    @Test
    public void seleniumEjercicio2() {
        primerSteps.abrirURL("https://www.google.com/");
        primerSteps.obtenerTituloPagina();
        primerSteps.obtenerURLActual();
        primerSteps.imprimirCodigoFuente();
        primerSteps.cerrarNavegador();
    }

    @Test
    public void seleniumEjercicio3() {

    }
}
